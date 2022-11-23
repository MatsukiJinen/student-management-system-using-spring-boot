package com.student.management.studentmanagementsystem.service.impl;

import com.student.management.studentmanagementsystem.entity.Student;
import com.student.management.studentmanagementsystem.repository.StudentRepository;
import com.student.management.studentmanagementsystem.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository repository;

    public StudentServiceImpl(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> getAll() {
        return repository.findAll();
    }

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Student update(Student student) {
        return repository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        repository.deleteById(id);
    }
}
