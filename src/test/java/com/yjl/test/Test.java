package com.yjl.test;

import com.yjl.dao.Studentdao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Test {
    @org.junit.Test
    public void test() throws IOException {
        String config = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(config);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.selectOne("com.yjl.controller.Studentdao.insertstuednt", 11);
//        Studentdao studentdao=sqlSession.getMapper(Studentdao.class);
//        System.out.println(studentdao);
        sqlSession.commit();
        sqlSession.close();


    }


    @org.junit.Test
    public void test2() throws IOException {
        String config = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(config);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.selectOne("com.yjl.controller.Studentdao.selectstudent","y");
        sqlSession.commit();
        sqlSession.close();


    }


    @org.junit.Test
    public void test3() throws IOException {
        String config = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(config);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.selectList("com.yjl.controller.Studentdao.mapstudent");
        sqlSession.commit();
        sqlSession.close();


    }
}
