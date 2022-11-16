package com.willtreuel.cardshopapi.service;


import com.willtreuel.cardshopapi.error.BodyMissingRequiredPropertiesException;
import com.willtreuel.cardshopapi.model.Card;
import com.willtreuel.cardshopapi.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CardService {

    @Autowired
    private CardRepository cr;

    public int addNewCard(@Valid Card card){
        if(card.getCardId() != null && cr.findById(card.getCardId()).isPresent()){
            String errMsg = String.format("Card with ID number %d already exist use PUT to update", card.getCardId());
            throw new EntityExistsException(errMsg);
        }
        return cr.save(card).getCardId();
    }

    public List<Card> getAllCard(){
        return cr.findAll();
    }

    public void deleteCardById(Integer id){
        cr.deleteById(id);
    }

    public Card updateCardById(@Valid Card card){
        if(card.getCardId() == null)
            throw new BodyMissingRequiredPropertiesException("To update card you must include the ID in the body.");
        if(cr.findById(card.getCardId()).isEmpty())
            throw new NoSuchElementException(String.format("A person with ID %d does not exist so it cant be updated.", card.getCardId()));
        return cr.save(card);
    }

    public Card getCardById(Integer id){
        return cr.findById(id).orElseThrow(() -> new NoSuchElementException("Box not found"));
    }
}
