package com.willtreuel.cardshopapi.service;


import com.willtreuel.cardshopapi.model.Admin;
import com.willtreuel.cardshopapi.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.willtreuel.cardshopapi.error.*;

import java.util.List;
import java.util.NoSuchElementException;
import javax.persistence.EntityExistsException;
import javax.validation.Valid;

@Service
public class AdminService {

    @Autowired
    private AdminRepository ar;

    public List<Admin> getAllAdmin(){
        return ar.findAll();
    }

    public Admin getAdminById(Integer id){
        return ar.findById(id).orElseThrow(() -> new NoSuchElementException("Admin not found!"));
    }

    public void deleteAddressById(Integer id){
        ar.deleteById(id);
    }

    public int addNewAdmin(@Valid Admin admin){
        if(admin.getAdminId() != null && ar.findById(admin.getAdminId()).isPresent()){
            String errMsg = String.format("Admin with ID number already exists", admin.getAdminId());
            throw new EntityExistsException(errMsg);
        }
        return ar.save(admin).getAdminId();
    }

    public Admin updateAdminById(Admin admin){
        if(admin.getAdminId() == null)
            throw new BodyMissingRequiredPropertiesException("Include id in body");
        if(ar.findById(admin.getAdminId()).isEmpty())
            throw new NoSuchElementException(String.format("An admin with ID %d does not exist so cant be updated.", admin.getAdminId()));
        return ar.save(admin);
    }
}
