package com.xopns.service;

import com.xopns.dao.StudentDao;
import com.xopns.domain.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public int addStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Override
    public int modifyStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Override
    public int removeStudentById(int id) {
        return studentDao.deleteStudentById(id);
    }

    @Override
    public Student findStudentById(int id) {
        return studentDao.selectStudentById(id);
    }

    @Override
    public List<Student> findAllStudent() {
        return studentDao.selectAllStudents();
    }
}
