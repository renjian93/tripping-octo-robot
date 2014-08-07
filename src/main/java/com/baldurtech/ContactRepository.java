package com.baldurtech;

public class ContactRepository {
    private DatabaseManager db;
    public ContactRepository(DatabaseManager db) {
        this.db = db;
    }
    public void deleteById(Long id) {
        String sql = "DELETE FROM contact WHERE id=" + id;
        db.executeUpdate(sql);
    }
    public void update(Contact contact) {
        String sql = "UPDATE contact SET email='xiaobai@gmail.com',home_address=NULL,job=NULL,job_level=NULL,memo=NULL,mobile='18234567890',name='xiaobai',office_address=NULL,vpmn=NULL,WHERE id=" + contact.getId();
        db.executeUpdate(sql);
    }
}