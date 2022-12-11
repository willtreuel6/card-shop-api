package com.willtreuel.cardshopapi.controller;


import com.willtreuel.cardshopapi.model.Footer;
import com.willtreuel.cardshopapi.service.FooterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FooterController {

    @Autowired
    private FooterService fs;

    @GetMapping("/footer")
    public ResponseEntity<List<Footer>> getAllFooter(){
        return ResponseEntity.status(HttpStatus.OK).body(fs.getAllFooter());
    }

    @PutMapping("/footer")
    public ResponseEntity<Footer> updateFooterById(@RequestBody Footer footer){
        Footer updatedFooter = fs.updateFooterById(footer);
        return new ResponseEntity<>(updatedFooter, HttpStatus.CREATED);
    }

}
