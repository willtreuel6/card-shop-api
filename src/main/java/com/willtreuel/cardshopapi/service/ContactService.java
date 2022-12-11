package com.willtreuel.cardshopapi.service;


import com.willtreuel.cardshopapi.error.BodyMissingRequiredPropertiesException;
import com.willtreuel.cardshopapi.model.Card;
import com.willtreuel.cardshopapi.model.Contact;
import com.willtreuel.cardshopapi.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ContactService {

    @Autowired
    private ContactRepository cr;

    public List<Contact> getAllContact(){
        return cr.findAll();
    }

    public Contact updateContactById(@Valid Contact contact){
        if(contact.getContactId() == null)
            throw new BodyMissingRequiredPropertiesException("To update you must include the ID in the body");
        if(cr.findById(contact.getContactId()).isEmpty())
            throw new NoSuchElementException(String.format("A contact with this ID does nto exist", contact.getContactId()));
        return cr.save(contact);
    }

    public Contact getContactById(Integer id){
        return cr.findById(id).orElseThrow(() -> new NoSuchElementException("Contact not found"));
    }

}
