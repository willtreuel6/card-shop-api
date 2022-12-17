package com.willtreuel.cardshopapi.model;


import javax.persistence.*;

@Entity
@Table(name = "home")
public class Home {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "homeId", nullable = false)
    private Integer homeId;

    @Column(name = "homeBannerBold")
    private String homeBannerBold;

    @Column(name = "homeBannerText")
    private String homeBannerText;

    @Column(name = "homeTitle")
    private String homeTitle;

    @Column(name = "homeDescription")
    private String homeDescription;

    @Column(name = "homeTitleTwo")
    private String homeTitleTwo;

    Home(){}

    Home(Integer homeId, String homeBannerBold, String homeBannerText, String homeTitle,String homeTitleTwo, String homeDescription){
        this.homeId = homeId;
        this.homeBannerBold = homeBannerBold;
        this.homeBannerText = homeBannerText;
        this.homeTitle = homeTitle;
        this.homeDescription = homeDescription;
        this.homeTitleTwo = homeTitleTwo;
    }

    public Integer getHomeId() {
        return homeId;
    }

    public void setHomeId(Integer homeId) {
        this.homeId = homeId;
    }

    public String getHomeBannerBold() {
        return homeBannerBold;
    }

    public void setHomeBannerBold(String homeBannerBold) {
        this.homeBannerBold = homeBannerBold;
    }

    public String getHomeBannerText() {
        return homeBannerText;
    }

    public void setHomeBannerText(String homeBannerText) {
        this.homeBannerText = homeBannerText;
    }

    public String getHomeTitle() {
        return homeTitle;
    }

    public void setHomeTitle(String homeTitle) {
        this.homeTitle = homeTitle;
    }

    public String getHomeDescription() {
        return homeDescription;
    }


    public void setHomeDescription(String homeDescription) {
        this.homeDescription = homeDescription;
    }

    public String getHomeTitleTwo() {
        return homeTitleTwo;
    }

    public void setHomeTitleTwo(String homeTitleTwo) {
        this.homeTitleTwo = homeTitleTwo;
    }
}
