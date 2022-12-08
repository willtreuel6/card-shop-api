package com.willtreuel.cardshopapi.controller;


import com.willtreuel.cardshopapi.model.Contact;
import com.willtreuel.cardshopapi.service.CardService;
import com.willtreuel.cardshopapi.service.ContactService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ContactController {

    @Autowired
    private ContactService cs;

    @GetMapping("/contact/{id}")
    public ResponseEntity<Contact> getContactById(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(cs.getContactById(id));
    }

    @PutMapping("/contact")
    public ResponseEntity<Contact> updateContactById(@RequestBody Contact contact){
        Contact updatedContact = cs.updateContactById(contact);
        return new ResponseEntity<>(updatedContact, HttpStatus.CREATED);
    }

}
