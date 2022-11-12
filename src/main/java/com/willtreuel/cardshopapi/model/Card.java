package com.willtreuel.cardshopapi.model;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "card")
public class Card {

    @Id
    @Column(name = "cardId", nullable = false)
    private Integer cardId;

    @Column(name = "cardName")
    private String cardName;

    @Column(name = "sport")
    private String sport;

    @Column(name = "price")
    private String price;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "adminId")
    private Admin admin;

    public Card(){}

    public Card(Integer cardId, String cardName, String sport, String price, String desc)
    {
        this.cardId = cardId;
        this.cardName = cardName;
        this.sport = sport;
        this.price = price;
        this.description = desc;
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
}
