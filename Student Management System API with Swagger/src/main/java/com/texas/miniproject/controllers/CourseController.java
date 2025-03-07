package com.texas.miniproject.controllers;

import com.texas.miniproject.entity.Course;
import com.texas.miniproject.services.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("course")
public class CourseController {

    private final CourseService courseService;

    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping
    public ResponseEntity<Course> save(@RequestBody Course course){
        return new ResponseEntity<>(courseService.saveCourse(course), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Course> list(){
        return courseService.listAllCourse();
    }

    @GetMapping("/{id}")
    public Optional<Course> getById(@PathVariable Long id){
        return courseService.getCourseBy(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourse(@PathVariable Long id){
        courseService.deleteCourse(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PutMapping
    public ResponseEntity<Course> update(@RequestBody Course course){
        return new ResponseEntity<>(courseService.updateCourse(course), HttpStatus.OK);
    }


}
