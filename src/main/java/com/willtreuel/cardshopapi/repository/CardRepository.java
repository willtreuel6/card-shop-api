package com.willtreuel.cardshopapi.repository;

import com.willtreuel.cardshopapi.model.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CardRepository extends CrudRepository<Card, Integer> {

    List<Card> findAll();
}
