package com.willtreuel.cardshopapi.controller;


import com.willtreuel.cardshopapi.model.Card;
import com.willtreuel.cardshopapi.model.Email;
import com.willtreuel.cardshopapi.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class EmailController {

    @Autowired
    private EmailService es;

    @GetMapping("/email")
    public ResponseEntity<List<Email>> getAllEmails(){
        return ResponseEntity.status(HttpStatus.OK).body(es.getAllEmail());
    }

    @DeleteMapping("/email/{id}")
    public ResponseEntity<Void> deleteEmailById(@PathVariable Integer id){
        es.deleteEmailById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/email")
    public ResponseEntity<Email> addNewEmail(@RequestBody Email email){
        Integer emailId = es.addNewEmail(email);
        return new ResponseEntity<>(es.getEmailById(emailId), HttpStatus.CREATED);
    }
}
