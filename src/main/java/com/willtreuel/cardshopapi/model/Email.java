package com.willtreuel.cardshopapi.model;


import javax.persistence.*;

@Entity
@Table(name = "email")
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emailId", nullable = false)
    private Integer emailId;

    @Column(name = "emailAddress")
    private String emailAddress;


    public Email(){}

    public Email(Integer emailId, String emailAddress){
        this.emailAddress = emailAddress;
        this.emailId = emailId;
    }

    public Integer getEmailId() {
        return emailId;
    }

    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
