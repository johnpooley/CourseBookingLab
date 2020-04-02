package com.codeclan.CourseBookingLab.repositories;

import com.codeclan.CourseBookingLab.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findCourseByName(String name);
}
