package com.willtreuel.cardshopapi.repository;

import com.willtreuel.cardshopapi.model.Email;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmailRepository extends CrudRepository<Email, Integer> {

    List<Email> findAll();

}
