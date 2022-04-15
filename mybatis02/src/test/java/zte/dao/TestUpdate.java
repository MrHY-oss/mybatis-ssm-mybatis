package zte.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.apache.ibatis.io.Resources;
import zte.domain.Student;

import java.io.IOException;
import java.io.InputStream;

public class TestUpdate {
    @Test
    public void testInsert() throws IOException {
        //1.mybatis 主配置文件
        String config = "mybatis.xml";
        //2. 读取配置文件
        InputStream in = Resources.getResourceAsStream(config);
        //3. 创建 SqlSessionFactory 对象, , 目的是获取  Sql Session
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //4. 获取 SqlSession,SqlSession 能执行 sql 语句
        SqlSession session = factory.openSession();
        //5. 创建保存数据的对象
        Student student = new Student();
        student.setId(1005);
        student.setAge(22);
        //6. 执行 更新 update
        int rows = session.update("zte.dao.StudentDao.updateStudent",student);
        //7. 提交事务
        session.commit();
        System.out.println(" 修改记录的行数:"+rows);
        //8. 关闭 SqlSession
        session.close();
    }
}
