package com.willtreuel.cardshopapi.service;


import com.willtreuel.cardshopapi.error.BodyMissingRequiredPropertiesException;
import com.willtreuel.cardshopapi.model.About;
import com.willtreuel.cardshopapi.repository.AboutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class AboutService {


    @Autowired
    private AboutRepository ar;

    public List<About> getAllAbout(){return ar.findAll();}

    public About updateAboutById(@Valid About about){
        if(about.getAboutId() == null)
            throw new BodyMissingRequiredPropertiesException("To update you must include ID in the body");
        if(ar.findById(about.getAboutId()).isEmpty())
            throw new NoSuchElementException(String.format("A about with this ID does not exist", about.getAboutId()));
        return ar.save(about);
    }

    public About getAboutById(Integer id){
        return ar.findById(id).orElseThrow(() -> new NoSuchElementException("About not found"));
    }
}
