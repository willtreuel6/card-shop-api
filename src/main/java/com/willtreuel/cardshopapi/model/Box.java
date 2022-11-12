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

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getSport() {
        return sport;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public Boolean getInStock(){
        return inStock;
    }

}
