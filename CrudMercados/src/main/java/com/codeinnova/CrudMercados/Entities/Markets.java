package com.codeinnova.CrudMercados.Entities;

import jakarta.persistence.*;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Set;

@Entity
public class Markets {
    
    //Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private boolean establishment;
    private boolean onlyCash;
    @Embedded
    private MarketLocation location;
    @Embedded
    private MarketOperatingHours operatingHours;
    @Embedded
    private MarketProducts products;
    @Embedded
    private MarketQualification qualification;
    @Embedded
    private MarketContact contact;

    //CONSTRUCTORS

    public Markets() {
    }

    public Markets(Long id, String name, boolean establishment, boolean onlyCash, MarketLocation location,
                   MarketOperatingHours operatingHours, MarketProducts products, MarketQualification qualification,
                   MarketContact contact) {
        this.id = id;
        this.name = name;
        this.establishment = establishment;
        this.onlyCash = onlyCash;
        this.location = location;
        this.operatingHours = operatingHours;
        this.products = products;
        this.qualification = qualification;
        this.contact = contact;
    }
    //GETTER AND SETTER
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEstablishment() {
        return establishment;
    }

    public void setEstablishment(boolean establishment) {
        this.establishment = establishment;
    }

    public boolean isOnlyCash() {
        return onlyCash;
    }

    public void setOnlyCash(boolean onlyCash) {
        this.onlyCash = onlyCash;
    }

    public MarketLocation getLocation() {
        return location;
    }

    public void setLocation(MarketLocation location) {
        this.location = location;
    }

    public MarketOperatingHours getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(MarketOperatingHours operatingHours) {
        this.operatingHours = operatingHours;
    }

    public MarketProducts getProducts() {
        return products;
    }

    public void setProducts(MarketProducts products) {
        this.products = products;
    }

    public MarketQualification getQualification() {
        return qualification;
    }

    public void setQualification(MarketQualification qualification) {
        this.qualification = qualification;
    }

    public MarketContact getContact() {
        return contact;
    }

    public void setContact(MarketContact contact) {
        this.contact = contact;
    }

    //TO STRING

    @Override
    public String toString() {
        return "Markets{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", establishment=" + establishment +
                ", onlyCash=" + onlyCash +
                ", location=" + location +
                ", operatingHours=" + operatingHours +
                ", products=" + products +
                ", qualification=" + qualification +
                ", contact=" + contact +
                '}';
    }
}




