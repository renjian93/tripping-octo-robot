package com.baldurtech;

public class ContactDaoMock implements ContactDao {
    Boolean saveHasInvoked = false;
    public Contact save(Contact contact) {
        saveHasInvoked = true;
        return contact;
    }
}