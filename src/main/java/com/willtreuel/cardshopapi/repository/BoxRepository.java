package com.willtreuel.cardshopapi.repository;

import com.willtreuel.cardshopapi.model.Box;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoxRepository extends CrudRepository<Box, Integer> {

    @Override
    List<Box> findAll();

}
