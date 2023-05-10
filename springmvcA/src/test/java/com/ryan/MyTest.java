package com.ryan;

import com.ryan.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyTest {

    @Test
    public void myMethod() throws IOException {
        //创建SQLSession
        SqlSessionFactoryBuilder ssfb = new SqlSessionFactoryBuilder();
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = ssfb.build(resourceAsStream);
        SqlSession sqlSession = factory.openSession();


        List<User> list = sqlSession.selectList("getAll");
        for (User users : list) {
            System.out.println(users);
        }


        sqlSession.close();
    }
}
