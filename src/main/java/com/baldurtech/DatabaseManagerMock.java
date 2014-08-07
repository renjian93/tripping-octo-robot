package com.baldurtech;

public class DatabaseManagerMock implements DatabaseManager {
    public String executeUpdateParam;
    public int executeUpdateShouldReturn = 0;
    public int executeUpdate(String sql, Object... params) {
        executeUpdateParam = sql;
        return executeUpdateShouldReturn;
    }
}