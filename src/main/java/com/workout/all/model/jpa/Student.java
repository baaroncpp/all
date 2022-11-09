package com.workout.all.model.jpa;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

/**
 * @PROJECT all an 11/3/2022
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_student")
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private int age;
    private String dept;
    private String email;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "t_student_course",
        joinColumns = {
            @JoinColumn(name = "student_id", referencedColumnName = "id") // parent entity joining with (current entity)
        },inverseJoinColumns = {
            @JoinColumn(name = "course_id", referencedColumnName = "id") // child entity joining with
    })
    @JsonManagedReference
    private Set<Course> courses;
}
