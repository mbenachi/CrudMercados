package com.codeinnova.CrudMercados.Entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class MarketQualification {

    private Float score;
    private String coment;

    //CONSTRUCTORES

    public MarketQualification() {
    }

    public MarketQualification(Float score, String coment) {
        this.score = score;
        this.coment = coment;
    }

    //GETTER AND SETTER

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public String getComent() {
        return coment;
    }

    public void setComent(String coment) {
        this.coment = coment;
    }

    //TO STRING

    @Override
    public String toString() {
        return "MarketQualification{" +
                "score=" + score +
                ", coment='" + coment + '\'' +
                '}';
    }
}
