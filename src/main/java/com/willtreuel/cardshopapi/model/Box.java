package com.willtreuel.cardshopapi.model;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "box")
public class Box {

    @Id
    @Column(name = "boxId", nullable = false)
    private Integer boxId;

    @Column(name = "boxName", nullable = false)
    private String boxName;

    @Column(name = "sport")
    private String sport;

    @Column(name = "price")
    private String price;

    @Column(name = "description")
    private String description;

    @Column(name = "inStock")
    private boolean inStock;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "adminId")
    private Admin admin;


    public Box(){}

    public Box(Integer boxId, String boxName, String sport, String price, String description, boolean inStock) {
        this.boxId = boxId;
        this.boxName = boxName;
        this.sport = sport;
        this.price = price;
        this.description = description;
        this.inStock = inStock;
    }

    public void setBoxId(Integer boxId) {
        this.boxId = boxId;
    }

    public Integer getBoxId() {
        return boxId;
    }

    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }

    public String getBoxName() {
        return boxName;
    }

    public void setBoxSport(String sport) {
        this.sport = sport;
    }

    public String getBoxSport() {
        return sport;
    }

    public void setBoxPrice(String price) {
        this.price = price;
    }

    public String getBoxPrice() {
        return price;
    }

    public void setBoxDescription(String description) {
        this.description = description;
    }

    public String getBoxDescription() {
        return description;
    }

    public void setBoxInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public Boolean getBoxInStock(){
        return inStock;
    }

}
