package com.zx.resultMap;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by zhangxu on 2017/6/29.
 */
public class test {

    public static void main( String[] args )throws Exception
    {

        //简单Result Map的测试
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        Blog b = (Blog)session.selectOne("getBlog",1);
        System.out.println(b);




    }

}
