package com.baldurtech;

import com.baldurtech.unit.MiniatureSpiceTestCase;
 
public class  ContactRepositoryTest extends MiniatureSpiceTestCase {
    ContactRepository contactRepository = new ContactRepository(); 
    DatabaseManagerMock db = new DatabaseManagerMock();
    public void test_删除指定ID的Contact() {
        contactRepository.deleteById(1L);       
        assertEquals("DELETE FROM contact WHERE id=1", db.executeUpdateParam);
    }
} 

class DatabaseManagerMock implements DatabaseManager {
    public String executeUpdateParam;
    public int executeUpdateShouldReturn = 0;
    public int executeUpdate(String sql) {
        executeUpdateParam = sql;
        return executeUpdateShouldReturn;
    }
}