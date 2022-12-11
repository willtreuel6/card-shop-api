package com.willtreuel.cardshopapi.service;


import com.willtreuel.cardshopapi.error.BodyMissingRequiredPropertiesException;
import com.willtreuel.cardshopapi.model.Footer;
import com.willtreuel.cardshopapi.repository.FooterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class FooterService {

    @Autowired
    private FooterRepository fr;

    public List<Footer> getAllFooter(){return fr.findAll();}

    public Footer updateFooterById(@Valid Footer footer){
        if(footer.getFooterId() == null)
            throw new BodyMissingRequiredPropertiesException("To update please provide a ID");
        if(fr.findById(footer.getFooterId()).isEmpty())
            throw new NoSuchElementException(String.format("A footer object with this ID doesnt exist"));
        return fr.save(footer);
    }
}
