package com.yevhent.fullstackdemo.init;

import com.yevhent.fullstackdemo.model.Contact;
import com.yevhent.fullstackdemo.repository.ContactRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoDataLoader implements CommandLineRunner {

    private final ContactRepository contactRepository;

    public DemoDataLoader(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 1; i < 4; i++) {
            contactRepository.save(new Contact("Yevhen" + i, "T" + i, "example" + i + "@gmail.com"));
        }
    }
}