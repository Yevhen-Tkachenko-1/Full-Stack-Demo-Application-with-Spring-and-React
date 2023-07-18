package com.yevhent.fullstackdemo.controller;

import com.yevhent.fullstackdemo.model.Contact;
import com.yevhent.fullstackdemo.repository.ContactRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api/contacts")
@CrossOrigin("http://localhost:3000")
@RequiredArgsConstructor
public class ContactsController {

    private final ContactRepository contactRepository;

    @GetMapping
    public Collection<Contact> getContacts() {
        return (Collection<Contact>) contactRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Contact> getContact(@PathVariable Long id) {
        return contactRepository.findById(id);
    }

    @PostMapping
    public Contact addContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable Long id) {
        contactRepository.deleteById(id);
    }

}