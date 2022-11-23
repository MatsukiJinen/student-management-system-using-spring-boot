package com.student.management.studentmanagementsystem.service;

import com.student.management.studentmanagementsystem.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student save(Student student);
    Student getStudentById(Long id);
    Student update(Student student);
    void deleteStudentById(Long id);
}
