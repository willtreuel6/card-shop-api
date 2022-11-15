package com.willtreuel.cardshopapi.repository;

import org.springframework.data.repository.CrudRepository;
import com.willtreuel.cardshopapi.model.Admin;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Integer> {

    @Override
    List<Admin> findAll();

}
