package com.yevhent.fullstackdemo.controller;

import com.yevhent.fullstackdemo.model.Contact;
import com.yevhent.fullstackdemo.repository.ContactRepository;
import com.yevhent.fullstackdemo.util.CollectionUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ApiController {

    private final ContactRepository contactRepository;

    @GetMapping("/contacts")
    public List<Contact> getContacts() {
        return CollectionUtil.toList(contactRepository.findAll());
    }

    @GetMapping("/contacts/{id}")
    public Optional<Contact> getContact(@PathVariable Long id) {
        return contactRepository.findById(id);
    }

    @PostMapping("/contacts")
    public Contact addContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    @DeleteMapping("/contacts/{id}")
    public void deleteContact(@PathVariable Long id) {
        contactRepository.deleteById(id);
    }

}