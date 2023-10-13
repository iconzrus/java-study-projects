package com.yuriybishel.spring.database.repository;

import com.yuriybishel.spring.database.pool.ConnectionPool;

public class CompanyRepository {
    private final ConnectionPool connectionPool;

    public CompanyRepository(ConnectionPool connectionPool) {
        this.connectionPool = connectionPool;
    }
}
