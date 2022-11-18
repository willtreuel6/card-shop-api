package com.willtreuel.cardshopapi.model;


import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

@Entity
@Table(name = "box")
public class Box {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "boxId", nullable = false)
    private Integer boxId;

    @Column(name = "boxName", nullable = false)
    private String boxName;

    @Column(name = "boxBrand")
    private String boxBrand;

    @Column(name = "boxYear")
    private Integer boxYear;
    @Column(name = "sport")
    private String sport;

    @Column(name = "price")
    private float price;


    @Column(name = "description")
    private String description;

    @Column(name = "inStock")
    private boolean inStock;

    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "adminId")
    private Admin admin;


    public Box(){}

    public Box(Integer boxId, String boxName,String boxBrand, String sport,Integer boxYear, float price, String description, boolean inStock) {
        this.boxId = boxId;
        this.boxName = boxName;
        this.sport = sport;
        this.boxYear = boxYear;
        this.price = price;
        this.description = description;
        this.inStock = inStock;
        this.boxBrand = boxBrand;
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

    public void setBoxBrand(String boxBrand) {
        this.boxBrand = boxBrand;
    }

    public String getBoxBrand() {
        return boxBrand;
    }

    public void setBoxYear(Integer boxYear) {
        this.boxYear = boxYear;
    }

    public Integer getBoxYear() {
        return boxYear;
    }

    public void setBoxSport(String sport) {
        this.sport = sport;
    }

    public String getBoxSport() {
        return sport;
    }

    public void setBoxPrice(float price) {
        this.price = price;
    }

    public float getBoxPrice() {
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
