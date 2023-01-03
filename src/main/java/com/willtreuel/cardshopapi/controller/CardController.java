package com.willtreuel.cardshopapi.controller;


import com.willtreuel.cardshopapi.model.Box;
import com.willtreuel.cardshopapi.model.Card;
import com.willtreuel.cardshopapi.service.CardService;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class CardController {

    @Autowired
    private CardService cs;

    @GetMapping("/card")
    public ResponseEntity<List<Card>> getAllCards(){
        return ResponseEntity.status(HttpStatus.OK).body(cs.getAllCard());
    }

    @GetMapping("/card/{id}")
    public ResponseEntity<Card> getCardById(@PathVariable Integer id){
        return new ResponseEntity<>(cs.getCardById(id), HttpStatus.OK);
    }

    @DeleteMapping("/card/{id}")
    public ResponseEntity<Void> deleteCardById(@PathVariable Integer id){
        cs.deleteCardById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PostMapping("/card")
    public ResponseEntity<Card> addNewCard(@RequestBody Card card){
        Integer cardId = cs.addNewCard(card);
        return new ResponseEntity<>(cs.getCardById(cardId), HttpStatus.CREATED);
    }

    @PutMapping("/card")
    public ResponseEntity<Card> UpdateCardById(@RequestBody Card card){
        Card updatedCard = cs.updateCardById(card);
        return new ResponseEntity<>(updatedCard, HttpStatus.CREATED);
    }


}
