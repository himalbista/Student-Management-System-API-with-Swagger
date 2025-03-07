package com.texas.miniproject.services;

import com.texas.miniproject.entity.Course;
import com.texas.miniproject.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService{

    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

    @Override
    public List<Course> listAllCourse() {
        return courseRepository.findAll();
    }

    @Override
    public Optional<Course> getCourseBy(Long id) {
        return courseRepository.findById(id);
    }

    @Override
    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Course updateCourse(Course course) {
        return courseRepository.saveAndFlush(course);
    }


}
