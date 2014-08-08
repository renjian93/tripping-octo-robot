package com.baldurtech;

import com.baldurtech.unit.MiniatureSpiceTestCase;

public class ContactServiceTest extends MiniatureSpiceTestCase {
    ContactDaoMock contactDaoMock = new ContactDaoMock();
    ContactService contactService = new ContactService(contactDaoMock);
    Contact contact = new Contact();
    public void test_用户名为空时将不被保存() {
        contact.setName("");
        contactService.save(contact);
        assertFalse(contactDaoMock.saveHasInvoked);
    }
}