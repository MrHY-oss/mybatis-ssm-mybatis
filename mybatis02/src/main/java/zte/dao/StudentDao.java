package zte.dao;

import zte.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> SelectStudents();
    int insertStudent(Student student);
    int updateStudent(Student student);

}
