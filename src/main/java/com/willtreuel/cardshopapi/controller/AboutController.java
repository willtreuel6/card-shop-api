package com.willtreuel.cardshopapi.controller;


import com.willtreuel.cardshopapi.model.About;
import com.willtreuel.cardshopapi.service.AboutService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class AboutController {

    @Autowired
    private AboutService as;

    @GetMapping("/about")
    public ResponseEntity<List<About>> getAbout(){
        return ResponseEntity.status(HttpStatus.OK).body(as.getAllAbout());

    }

    @PutMapping("/about")
    public ResponseEntity<About> updateAboutByID(@RequestBody About about){
        About updatedAbout = as.updateAboutById(about);
        return new ResponseEntity<>(updatedAbout, HttpStatus.CREATED);
    }


}
