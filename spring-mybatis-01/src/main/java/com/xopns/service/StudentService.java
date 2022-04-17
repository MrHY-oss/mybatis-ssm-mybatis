package com.xopns.service;

import com.xopns.domain.Student;

import java.util.List;

public interface StudentService {
    int addStudent(Student student);
    int modifyStudent(Student student);
    int removeStudentById(int id);
    Student findStudentById(int id);
    List<Student> findAllStudent();

}
