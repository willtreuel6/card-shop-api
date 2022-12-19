package com.willtreuel.cardshopapi.repository;


import com.willtreuel.cardshopapi.model.Faq;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FaqRepository extends CrudRepository<Faq, Integer> {

    @Override
    List<Faq> findAll();
}
