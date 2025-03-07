package com.texas.miniproject.services;

import com.texas.miniproject.entity.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    Student createStudent(Student student);

    List<Student> listAllStudent();

    Optional<Student> getStudentBy(long id);

    void deleteStudent(Long id);

    Student updateStudent(Student student);
}
