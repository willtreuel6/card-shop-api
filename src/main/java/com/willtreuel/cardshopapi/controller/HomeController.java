package com.willtreuel.cardshopapi.controller;


import com.willtreuel.cardshopapi.model.Home;
import com.willtreuel.cardshopapi.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HomeController {

    @Autowired
    private HomeService hs;

    @GetMapping("/home")
    public ResponseEntity<List<Home>> getAllHome(){
        return ResponseEntity.status(HttpStatus.OK).body(hs.getAllHome());
    }

    @PutMapping("/home")
    public ResponseEntity<Home> updateHomeById(@RequestBody Home home){
        Home updatedHome = hs.updateHomeById(home);
        return new ResponseEntity<>(updatedHome, HttpStatus.CREATED);
    }
}
