package com.yuriybishel.spring;

import com.yuriybishel.spring.database.pool.ConnectionPool;
import com.yuriybishel.spring.database.repository.CompanyRepository;
import com.yuriybishel.spring.database.repository.UserRepository;
import com.yuriybishel.spring.ioc.Container;
import com.yuriybishel.spring.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationRunner {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("application.xml")) {
            var connectionPool = context.getBean("pool1", com.yuriybishel.spring.database.pool.ConnectionPool.class);
            System.out.println(connectionPool);
            var companyRepository = context.getBean("companyRepository", CompanyRepository.class);
            System.out.println(companyRepository);




        }


    }
}
