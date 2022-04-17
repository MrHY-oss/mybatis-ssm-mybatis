package com.xopns;

import com.xopns.domain.Student;
import com.xopns.service.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void testInsert(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ac.getBean("studentService");
        Student student = new Student();
        student.setId(1001);
        student.setAge(29);
        student.setName("Jack");
        int insert = service.addStudent(student);
        System.out.println(insert);
    }

    @Test
    public void testUpdate(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ac.getBean("studentService");
        Student student = new Student();
        student.setId(1001);
        student.setAge(30);
        student.setName("Muck");
        int update = service.modifyStudent(student);
        System.out.println(update);
    }

    @Test
    public void testSelectId(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ac.getBean("studentService");
        Student selectid = service.findStudentById(1002);
        System.out.println(selectid);
    }

    @Test
    public void testSelectAll(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ac.getBean("studentService");
        List<Student> selectall = service.findAllStudent();
        System.out.println(selectall);
    }

    @Test
    public void testDeleteId(){
        String config = "applicationContext.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(config);
        StudentService service = (StudentService) ac.getBean("studentService");
        int delete = service.removeStudentById(1002);
        System.out.println(delete);
    }
}
