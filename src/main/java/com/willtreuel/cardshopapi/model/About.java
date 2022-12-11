package com.willtreuel.cardshopapi.model;


import javax.persistence.*;

@Entity
@Table(name="about")
public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aboutId", nullable = false)
    private Integer aboutId;


    @Column(name = "aboutName")
    private String aboutName;

    @Column(name = "aboutDescription")
    private String aboutDescription;

    public About(){}

    public About(Integer aboutId, String aboutName, String aboutDescription){
        this.aboutId = aboutId;
        this.aboutDescription = aboutDescription;
        this.aboutName = aboutName;
    }

    public Integer getAboutId() {
        return aboutId;
    }

    public void setAboutId(Integer aboutId) {
        this.aboutId = aboutId;
    }

    public String getAboutName() {
        return aboutName;
    }

    public void setAboutName(String aboutName) {
        this.aboutName = aboutName;
    }

    public String getAboutDescription() {
        return aboutDescription;
    }

    public void setAboutDescription(String aboutDescription) {
        this.aboutDescription = aboutDescription;
    }
}
