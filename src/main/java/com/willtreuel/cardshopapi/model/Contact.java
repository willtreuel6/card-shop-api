package com.willtreuel.cardshopapi.model;


import javax.persistence.*;

@Entity
@Table(name="contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contactId", nullable = false)
    private Integer contactId;

    @Column(name = "contactDescription")
    private String contactDescription;

    @Column(name = "contactAddress")
    private String contactAddress;

    @Column(name = "contactEmail")
    private String contactEmail;

    @Column(name = "contactNumber")
    private String contactNumber;

    public Contact(){}

    public Contact(Integer contactId, String contactDescription, String contactAddress, String contactEmail, String contactNumber){
        this.contactId = contactId;
        this.contactDescription = contactDescription;
        this.contactAddress = contactAddress;
        this.contactEmail = contactEmail;
        this.contactNumber = contactNumber;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getContactDescription() {
        return contactDescription;
    }

    public void setContactDescription(String contactDescription) {
        this.contactDescription = contactDescription;
    }

    public String getContactAddress(){
        return contactAddress;
    }

    public void setContactAddress(String contactAddress){
        this.contactAddress = contactAddress;
    }

    public String getContactEmail(){
        return contactEmail;
    }

    public void setContactEmail(String contactEmail){
        this.contactEmail = contactEmail;
    }

    public String getContactNumber(){
        return contactNumber;
    }

    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }


}
