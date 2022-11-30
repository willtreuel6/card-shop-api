package com.willtreuel.cardshopapi.service;


import com.willtreuel.cardshopapi.model.Card;
import com.willtreuel.cardshopapi.model.Email;
import com.willtreuel.cardshopapi.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import javax.validation.Valid;
import java.util.List;

@Service
public class EmailService {

    @Autowired
    private EmailRepository er;

    public int addNewEmail(@Valid Email email){
        if(email.getEmailId() != null && er.findById(email.getEmailId()).isPresent()){
            String errMsg = String.format("Card with ID number %d already exist use PUT to update", email.getEmailId());
            throw new EntityExistsException(errMsg);
        }
        return er.save(email).getEmailId();
    }

    public List<Email> getAllEmail(){
        return er.findAll();
    }

    public void deleteEmailById(Integer id){
        er.deleteById(id);
    }



}
