package com.willtreuel.cardshopapi.repository;


import com.willtreuel.cardshopapi.model.About;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AboutRepository extends CrudRepository<About, Integer> {

    @Override
    List<About> findAll();

}
