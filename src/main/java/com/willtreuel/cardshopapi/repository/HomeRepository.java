package com.willtreuel.cardshopapi.repository;


import com.willtreuel.cardshopapi.model.Home;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HomeRepository extends CrudRepository<Home, Integer> {

    List<Home> findAll();
}
