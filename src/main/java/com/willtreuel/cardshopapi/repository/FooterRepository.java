package com.willtreuel.cardshopapi.repository;


import com.willtreuel.cardshopapi.model.Footer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FooterRepository extends CrudRepository<Footer, Integer> {

    List<Footer> findAll();
}
