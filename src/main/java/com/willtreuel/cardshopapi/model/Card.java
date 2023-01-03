package com.willtreuel.cardshopapi.model;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cardId", nullable = false)
    private Integer cardId;

    @Column(name = "cardName")
    private String cardName;

    @Column(name = "cardBrand")
    private String cardBrand;

    @Column(name = "cardYear")
    private Integer cardYear;

    @Column(name = "sport")
    private String sport;

    @Column(name = "price")
    private String price;

    @Column(name = "description")
    private String description;

    @Column(name = "cardImage")
    private String cardImage;

    @Column(name = "cardEbay")
    private String cardEbay;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "adminId")
    private Admin admin;

    public Card(){}

    public Card(Integer cardId, String cardImage, String cardName, String sport, String price, String desc, String cardBrand, Integer cardYear, String cardEbay)
    {
        this.cardId = cardId;
        this.cardName = cardName;
        this.sport = sport;
        this.price = price;
        this.description = desc;
        this.cardBrand = cardBrand;
        this.cardYear = cardYear;
        this.cardImage = cardImage;
        this.cardEbay = cardEbay;
    }

    public Integer getCardId() {
        return cardId;
    }

    public void setCardId(Integer cardId) {
        this.cardId = cardId;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setCardSport(String sport) {
        this.sport = sport;
    }

    public String getCardSport() {
        return sport;
    }

    public void setCardPrice(String price) {
        this.price = price;
    }

    public String getCardPrice() {
        return price;
    }

    public void setCardDescription(String description) {
        this.description = description;
    }

    public String getCardDescription() {
        return description;
    }

    public void setCardBrand(String cardBrand) {
        this.cardBrand = cardBrand;
    }

    public String getCardBrand() {
        return cardBrand;
    }

    public void setCardYear(Integer cardYear) {
        this.cardYear = cardYear;
    }

    public Integer getCardYear() {
        return cardYear;
    }

    public String getCardImage() {
        return cardImage;
    }

    public void setCardImage(String cardImage) {
        this.cardImage = cardImage;
    }

    public String getCardEbay() {
        return cardEbay;
    }

    public void setCardEbay(String cardEbay) {
        this.cardEbay = cardEbay;
    }
}
