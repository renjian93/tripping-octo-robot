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
        String sql = "UPDATE contact SET email=?,home_address=?,job=?,job_level=?,memo=?,mobile=?,name=?,office_address=?,vpmn=?,WHERE id=?";
        db.executeUpdate(sql, contact.getEmail()
                            , contact.getHomeAddress()
                            , contact.getJob()
                            , contact.getJobLevel()
                            , contact.getMemo()
                            , contact.getMobile()
                            , contact.getName()
                            , contact.getOfficeAddress()
                            , contact.getVpmn()
                            , contact.getId()
                            );
    }
}