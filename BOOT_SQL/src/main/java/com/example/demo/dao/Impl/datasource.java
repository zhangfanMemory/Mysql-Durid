package com.example.demo.dao.Impl;

import com.example.demo.dao.UserDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;
import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class datasource {

    @Resource
    private DataSource dataSource;

    @Resource
    private UserDao userDao;
    @SuppressWarnings("all")
    @Test
    public void testconnect(){
        //System.out.println(this.dataSource);
        System.out.println(userDao.findall());
    }

}
