package com.baldurtech;

import com.baldurtech.unit.MiniatureSpiceTestCase;
 
public class  ContactRepositoryTest extends MiniatureSpiceTestCase {
    DatabaseManagerMock db = new DatabaseManagerMock();
    ContactRepository contactRepository = new ContactRepository(db); 
   
    public void test_删除指定ID的Contact() {
        contactRepository.deleteById(1L);       
        assertEqualsIgnoreCase("delete FROM contact WHERE id=1", db.executeUpdateParam);
    }
    
    public void test_更新指定ID的Contact() {
        Contact contact = new Contact();
        contact.setId(1L);
        contact.setEmail("xiaobai@gmail.com");
        contact.setName("xiaobai");
        contact.setMobile("18234567890");
        contactRepository.update(contact);
        assertEqualsIgnoreCase("UPDATE contact SET email='xiaobai@gmail.com',home_address=NULL,job=NULL,job_level=NULL,memo=NULL,mobile='18234567890',name='xiaobai',office_address=NULL,vpmn=NULL,WHERE id=1", db.executeUpdateParam);
    }
} 

