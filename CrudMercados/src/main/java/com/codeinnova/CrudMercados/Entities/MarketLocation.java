package com.codeinnova.CrudMercados.Entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class MarketLocation {

    private Long latidud;
    private Long longitud;
    private String adress;

    //CONSTRUCTORES

    public MarketLocation() {
    }

    public MarketLocation(Long latidud, Long longitud, String adress) {
        this.latidud = latidud;
        this.longitud = longitud;
        this.adress = adress;
    }

    //GETTER AND SETTER

    public Long getLatidud() {
        return latidud;
    }

    public void setLatidud(Long latidud) {
        this.latidud = latidud;
    }

    public Long getLongitud() {
        return longitud;
    }

    public void setLongitud(Long longitud) {
        this.longitud = longitud;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }


    //TOSTRING

    @Override
    public String toString() {
        return "MarketLocation{" +
                "latidud=" + latidud +
                ", longitud=" + longitud +
                ", adress='" + adress + '\'' +
                '}';
    }
}
