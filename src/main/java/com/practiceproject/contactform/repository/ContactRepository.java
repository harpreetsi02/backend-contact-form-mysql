package com.practiceproject.contactform.repository;

import com.practiceproject.contactform.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContactRepository extends JpaRepository<Contact, Long> {
    List<Contact> findByIsRead(boolean isRead);
}
