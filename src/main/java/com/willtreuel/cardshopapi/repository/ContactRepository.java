package com.willtreuel.cardshopapi.repository;


import com.willtreuel.cardshopapi.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Integer> {

    @Override
    List<Contact> findAll();


}
