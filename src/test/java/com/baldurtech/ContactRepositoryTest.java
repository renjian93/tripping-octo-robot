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
        assertEqualsIgnoreCase("UPDATE contact SET email=?,home_address=?,job=?,job_level=?,memo=?,mobile=?,name=?,office_address=?,vpmn=?,WHERE id=?", db.executeUpdateParam);
        assertArrayEquals(new Object[]{"xiaobai@gmail.com",null,null,null,null,"18234567890","xiaobai",null,null,1L},db.executeUpdateParam2);
    }
   
} 

