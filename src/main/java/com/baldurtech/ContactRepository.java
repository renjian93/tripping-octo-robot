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
}