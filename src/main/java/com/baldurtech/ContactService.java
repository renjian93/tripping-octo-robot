package com.baldurtech;

public class ContactService {
    ContactDao contactDao;
    
    public ContactService(ContactDao contactDao) {
        this.contactDao = contactDao;
    }
    
    public Contact save(Contact contact) {
        if(contact.getName() != "") 
            return contactDao.save(contact);
        return contact;
    }
}