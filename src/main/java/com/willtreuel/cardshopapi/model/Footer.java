package com.willtreuel.cardshopapi.model;


import javax.persistence.*;

@Entity
@Table(name = "footer")
public class Footer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "footerId", nullable = false)
    private Integer footerId;

    @Column(name = "footerBold")
    private String footerBold;

    @Column(name = "footerText")
    private String footerText;


    Footer(){}

    Footer(Integer footerId, String footerBold, String footerText){
        this.footerId = footerId;
        this.footerBold = footerBold;
        this.footerText = footerText;
    }

    public Integer getFooterId() {
        return footerId;
    }

    public void setFooterId(Integer footerId) {
        this.footerId = footerId;
    }

    public String getFooterBold() {
        return footerBold;
    }

    public void setFooterBold(String footerBold) {
        this.footerBold = footerBold;
    }

    public String getFooterText() {
        return footerText;
    }
    public void setFooterText(String footerText) {
        this.footerText = footerText;
    }









}
