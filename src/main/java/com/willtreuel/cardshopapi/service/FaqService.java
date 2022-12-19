package com.willtreuel.cardshopapi.service;


import com.willtreuel.cardshopapi.error.BodyMissingRequiredPropertiesException;
import com.willtreuel.cardshopapi.model.Faq;
import com.willtreuel.cardshopapi.repository.FaqRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class FaqService {

    @Autowired
    private FaqRepository fr;

    public List<Faq> getAllFaq(){ return fr.findAll();}

    public Faq updateFaqById(@Valid Faq faq){
        if(faq.getFaqId() == null)
            throw new BodyMissingRequiredPropertiesException("To update you must include the ID in the vody");
        if(fr.findById(faq.getFaqId()).isEmpty())
            throw new NoSuchElementException(String.format("A faq with this ID does not exist", faq.getFaqId()));
        return fr.save(faq);
    }

    public Faq getFaqById(Integer id){
        return fr.findById(id).orElseThrow(() -> new NoSuchElementException("Faq not found"));
    }
}
