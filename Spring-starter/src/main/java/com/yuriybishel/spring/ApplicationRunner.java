package com.yuriybishel.spring;

import com.yuriybishel.spring.database.pool.ConnectionPool;
import com.yuriybishel.spring.database.repository.CompanyRepository;
import com.yuriybishel.spring.database.repository.UserRepository;
import com.yuriybishel.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {

    public static void main(String[] args) {
        var context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(context.getBean(ConnectionPool.class));

    }
}
