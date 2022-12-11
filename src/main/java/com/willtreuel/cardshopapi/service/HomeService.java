package com.willtreuel.cardshopapi.service;


import com.willtreuel.cardshopapi.error.BodyMissingRequiredPropertiesException;
import com.willtreuel.cardshopapi.model.Home;
import com.willtreuel.cardshopapi.repository.HomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class HomeService {

    @Autowired
    private HomeRepository hr;

    public List<Home> getAllHome(){return hr.findAll();}

    public Home updateHomeById(@Valid Home home){
        if(home.getHomeId()== null)
            throw new BodyMissingRequiredPropertiesException("To update you must include an ID in the body");
        if(hr.findById(home.getHomeId()).isEmpty())
            throw new NoSuchElementException(String.format("A home object with this ID does nto exist"));
        return hr.save(home);
    }

    public Home getHomeById(Integer id){
        return hr.findById(id).orElseThrow(() -> new NoSuchElementException("Home object not found"));
    }
}
