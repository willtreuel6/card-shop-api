package com.willtreuel.cardshopapi.service;


import com.willtreuel.cardshopapi.error.BodyMissingRequiredPropertiesException;
import com.willtreuel.cardshopapi.model.Admin;
import com.willtreuel.cardshopapi.model.Box;
import com.willtreuel.cardshopapi.repository.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityExistsException;
import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BoxService {

    @Autowired
    private BoxRepository br;

    public int addNewBox(@Valid Box box){
        if (box.getBoxId() != null && br.findById(box.getBoxId()).isPresent()){
            String errMsg = String.format("Box with id number %d already exists, to update use PUT", box.getBoxId());
            throw new EntityExistsException(errMsg);
        }
        return br.save(box).getBoxId();
    }

    public List<Box> getAllBox(){
        return br.findAll();
    }

    public void deleteBoxById(int id){
        br.deleteById(id);
    }

    public Box updateBoxById(@Valid Box box){
        if (box.getBoxId() == null)
            throw new BodyMissingRequiredPropertiesException("To update box you must include its id int he body");
        if (br.findById(box.getBoxId()).isEmpty())
            throw new NoSuchElementException(String.format("A person with ID %d does not exist so it can't be updated", box.getBoxId()));
        return br.save(box);
    }


    public Box getBoxById(Integer id){
        return br.findById(id).orElseThrow(() -> new NoSuchElementException("Box not found!"));
    }





}
