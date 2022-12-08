package com.willtreuel.cardshopapi.controller;


import com.willtreuel.cardshopapi.model.Card;
import com.willtreuel.cardshopapi.model.Contact;
import com.willtreuel.cardshopapi.service.CardService;
import com.willtreuel.cardshopapi.service.ContactService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ContactController {

    @Autowired
    private ContactService cs;

    @GetMapping("/contact/")
    public ResponseEntity<List<Contact>> getContact(){
        return ResponseEntity.status(HttpStatus.OK).body(cs.getContact());
    }

    @PutMapping("/contact")
    public ResponseEntity<Contact> updateContactById(@RequestBody Contact contact){
        Contact updatedContact = cs.updateContactById(contact);
        return new ResponseEntity<>(updatedContact, HttpStatus.CREATED);
    }

}
