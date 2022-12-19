package com.willtreuel.cardshopapi.controller;


import com.willtreuel.cardshopapi.model.Faq;
import com.willtreuel.cardshopapi.service.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class FaqController {

    @Autowired
    private FaqService fs;

    @GetMapping("/faq")
    public ResponseEntity<List<Faq>> getFaq(){
        return ResponseEntity.status(HttpStatus.OK).body(fs.getAllFaq());
    }

    @PutMapping("/faq")
    public ResponseEntity<Faq> updateFaqById(@RequestBody Faq faq){
        Faq updatedFaq = fs.updateFaqById(faq);
        return new ResponseEntity<>(updatedFaq, HttpStatus.CREATED);
    }
}
