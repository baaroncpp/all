package com.workout.all.repository;

import com.workout.all.model.jpa.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @PROJECT all an 11/3/2022
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
