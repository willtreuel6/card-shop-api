package com.willtreuel.cardshopapi.model;


import javax.persistence.*;
import java.util.List;


@Entity
@Table(name="admin")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adminId", nullable = false)
    private Integer adminId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "pWord")
    private String pWord;

    @OneToMany(mappedBy = "admin")
    private List<Box> boxList;

    @OneToMany(mappedBy = "admin")
    private List<Card> cardList;


    public Admin() {
    }

    public Admin(Integer aId, String fName, String lName, String email, String passWord){
        this.adminId = aId;
        this.firstName = fName;
        this.lastName = lName;
        this.email = email;
        this.pWord = passWord;
}

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getpWord() {
        return pWord;
    }

    public void setpWord(String pWord) {
        this.pWord = pWord;
    }
}

