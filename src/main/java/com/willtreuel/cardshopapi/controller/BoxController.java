package com.willtreuel.cardshopapi.controller;



import com.willtreuel.cardshopapi.model.Admin;
import com.willtreuel.cardshopapi.model.Box;
import com.willtreuel.cardshopapi.service.BoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class BoxController {

    @Autowired
    private BoxService bs;

    @GetMapping("/box")
    public ResponseEntity<List<Box>> getAllBoxes(){
        return ResponseEntity.status(HttpStatus.OK).body(bs.getAllBox());
    }


    @DeleteMapping("/box/{id}")
    public ResponseEntity<Void> deleteBoxById(@PathVariable Integer id){
        bs.deleteBoxById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/box")
    public ResponseEntity<Box> addNewBox(@RequestBody Box box){
        Integer boxId = bs.addNewBox(box);
        return new ResponseEntity<>(bs.getBoxById(boxId), HttpStatus.CREATED);
    }

    @PutMapping("/box")
    public ResponseEntity<Box> updateBoxById( @RequestBody Box box){
        Box updatedBox = bs.updateBoxById( box);
        return new ResponseEntity<>(updatedBox, HttpStatus.CREATED);
    }
}
