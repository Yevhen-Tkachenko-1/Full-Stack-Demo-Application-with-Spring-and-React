package com.yevhent.fullstackdemo.repository;

import com.yevhent.fullstackdemo.model.Contact;
import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, Long> {

}