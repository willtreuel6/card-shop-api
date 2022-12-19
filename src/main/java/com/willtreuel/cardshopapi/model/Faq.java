package com.willtreuel.cardshopapi.model;


import javax.persistence.*;

@Entity
@Table(name = "faq")
public class Faq {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "faqId", nullable = false)
    private Integer faqId;

    @Column(name = "faqBoldHeader")
    private String faqBoldHeader;

    @Column(name = "faqDescription")
    private String faqDescription;

    @Column(name = "faqQOne")
    private String faqQOne;

    @Column(name = "faqQTwo")
    private String faqQTwo;

    @Column(name = "faqQThree")
    private String faqQThree;

    @Column(name = "faqQFour")
    private String faqQFour;

    @Column(name = "faqAOne")
    private String faqAOne;

    @Column(name = "faqATwo")
    private String faqATwo;

    @Column(name = "faqAThree")
    private String faqAThree;

    @Column(name = "faqAFour")
    private String faqAFour;

    @Column(name = "faqBoldFoot")
    private String faqBoldFoot;

    @Column(name = "faqFootDescription")
    private String faqFootDescription;


    public Faq(){}

    public Faq(Integer faqId,String faqBoldHeader, String faqDescription, String faqQOne, String faqQTwo, String faqQThree, String faqQFour, String faqAOne, String faqATwo, String faqAThree, String faqAFour, String faqBoldFoot, String faqFootDescription){
        this.faqId = faqId;
        this.faqBoldHeader = faqBoldHeader;
        this.faqDescription = faqDescription;
        this.faqQOne = faqQOne;
        this.faqQTwo = faqQTwo;
        this.faqQThree = faqQThree;
        this.faqQFour = faqQFour;
        this.faqAOne = faqAOne;
        this.faqATwo = faqATwo;
        this.faqAThree = faqAThree;
        this.faqAFour = faqAFour;
        this.faqBoldFoot = faqBoldFoot;
        this.faqFootDescription = faqFootDescription;
    }

    public Integer getFaqId() {
        return faqId;
    }

    public void setFaqId(Integer faqId) {
        this.faqId = faqId;
    }

    public String getFaqBoldHeader() {
        return faqBoldHeader;
    }

    public void setFaqBoldHeader(String faqBoldHeader) {
        this.faqBoldHeader = faqBoldHeader;
    }

    public String getFaqDescription() {
        return faqDescription;
    }

    public void setFaqDescription(String faqDescription) {
        this.faqDescription = faqDescription;
    }

    public String getFaqQOne() {
        return faqQOne;
    }

    public void setFaqQOne(String faqQOne) {
        this.faqQOne = faqQOne;
    }

    public String getFaqQTwo() {
        return faqQTwo;
    }

    public void setFaqQTwo(String faqQTwo) {
        this.faqQTwo = faqQTwo;
    }

    public String getFaqQThree() {
        return faqQThree;
    }

    public void setFaqQThree(String faqQThree) {
        this.faqQThree = faqQThree;
    }

    public String getFaqQFour() {
        return faqQFour;
    }

    public void setFaqQFour(String faqQFour) {
        this.faqQFour = faqQFour;
    }

    public String getFaqAOne() {
        return faqAOne;
    }

    public void setFaqAOne(String faqAOne) {
        this.faqAOne = faqAOne;
    }

    public String getFaqATwo() {
        return faqATwo;
    }

    public void setFaqATwo(String faqATwo) {
        this.faqATwo = faqATwo;
    }


    public String getFaqAThree() {
        return faqAThree;
    }


    public void setFaqAThree(String faqAThree) {
        this.faqAThree = faqAThree;
    }

    public String getFaqAFour() {
        return faqAFour;
    }

    public void setFaqAFour(String faqAFour) {
        this.faqAFour = faqAFour;
    }

    public String getFaqBoldFoot() {
        return faqBoldFoot;
    }

    public void setFaqBoldFoot(String faqBoldFoot) {
        this.faqBoldFoot = faqBoldFoot;
    }

    public String getFaqFootDescription() {
        return faqFootDescription;
    }

    public void setFaqFootDescription(String faqFootDescription) {
        this.faqFootDescription = faqFootDescription;
    }
}

