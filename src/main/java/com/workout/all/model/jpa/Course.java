package com.workout.all.model.jpa;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.Set;

/**
 * @PROJECT all an 11/3/2022
 */
@Entity
@Table(name = "t_course")
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String abbreviation;
    private int modules;

    @ManyToMany(mappedBy = "courses", fetch = FetchType.LAZY) // mappedBy specifies the entity that owns bidirectional relationship
    @JsonBackReference
    private Set<Student> students;
}
