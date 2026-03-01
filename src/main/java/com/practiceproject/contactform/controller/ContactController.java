package com.practiceproject.contactform.controller;

import com.practiceproject.contactform.entity.Contact;
import com.practiceproject.contactform.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    // SUBMIT FORM
    @PostMapping
    public Contact submitForm(@RequestBody Contact contact) {
        return contactService.saveContact(contact);
    }

    // GET ALL MESSAGES
    @GetMapping
    public List<Contact> getAllContacts() {
        return contactService.getAllContacts();
    }

    // GET UNREAD
    @GetMapping("/unread")
    public List<Contact> getUnreadContacts() {
        return contactService.getUnreadContacts();
    }

    // MARK AS READ
    @PutMapping("/{id}/read")
    public Contact markAsRead(@PathVariable Long id) {
        return contactService.markAsRead(id);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable Long id) {
        contactService.deleteContact(id);
    }
}
