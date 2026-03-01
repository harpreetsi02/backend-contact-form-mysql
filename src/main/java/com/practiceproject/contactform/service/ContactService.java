package com.practiceproject.contactform.service;

import com.practiceproject.contactform.entity.Contact;
import com.practiceproject.contactform.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class ContactService {
    private final ContactRepository contactRepository;

    public ContactService(ContactRepository contactRepository){
        this.contactRepository = contactRepository;
    }

//    Save form
    public Contact saveContact(Contact contact){
        contact.setRead(false);
        contact.setCreatedAt(LocalDateTime.now());

        return contactRepository.save(contact);
    }

    // GET ALL
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    // GET UNREAD
    public List<Contact> getUnreadContacts() {
        return contactRepository.findByIsRead(false);
    }

    // MARK AS READ
    public Contact markAsRead(Long id) {

        Contact contact = contactRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Message not found"));

        contact.setRead(true);

        return contactRepository.save(contact);
    }

    // DELETE
    public void deleteContact(Long id) {
        contactRepository.deleteById(id);
    }
}
