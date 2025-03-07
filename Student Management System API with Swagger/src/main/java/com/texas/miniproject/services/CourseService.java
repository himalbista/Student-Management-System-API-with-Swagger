package com.texas.miniproject.services;

import com.texas.miniproject.entity.Course;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    Course saveCourse(Course course);

    List<Course> listAllCourse();

    Optional<Course> getCourseBy(Long id);

    void deleteCourse(Long id);

    Course updateCourse(Course course);
}
