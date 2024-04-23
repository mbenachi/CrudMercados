package com.codeinnova.CrudMercados.Entities;

import jakarta.persistence.*;


import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Table(name = "Markets")
public class Markets {

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address; //
    private Set<DayOfWeek> openingDays; //Dias en los que se presta el servicio,m se usa "Set" para asegurar que los días no se repitan
    private LocalTime openingTime; // Hora de apertura
    private LocalTime closingTime; // Horar de cierre
    private boolean stationary; // Mercado fijo, que siempre está en el mismo lugar
    private boolean itinerant; // Mercado no fijo
    private String products; // productos disponibles

    //Constructores

    public Markets() {
    }

    public Markets(Long id, String name, String address, Set<DayOfWeek> openingDays, LocalTime openingTime,
                   LocalTime closingTime, boolean stationary, boolean itinerant, String products) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.openingDays = openingDays;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.stationary = stationary;
        this.itinerant = itinerant;
        this.products = products;
    }

    //Getter & Setter

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<DayOfWeek> getOpeningDays() {
        return openingDays;
    }

    public void setOpeningDays(Set<DayOfWeek> openingDays) {
        this.openingDays = openingDays;
    }

    public LocalTime getOpeningTime() {
        return openingTime;
    }

    public void setOpeningTime(LocalTime openingTime) {
        this.openingTime = openingTime;
    }

    public LocalTime getClosingTime() {
        return closingTime;
    }

    public void setClosingTime(LocalTime closingTime) {
        this.closingTime = closingTime;
    }

    public boolean isStationary() {
        return stationary;
    }

    public void setStationary(boolean stationary) {
        this.stationary = stationary;
    }

    public boolean isItinerant() {
        return itinerant;
    }

    public void setItinerant(boolean itinerant) {
        this.itinerant = itinerant;
    }

    public String getProducts() {
        return products;
    }

    public void setProducts(String products) {
        this.products = products;
    }

    //ToString

    @Override
    public String toString() {
        return "Markets{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", openigDays=" + openingDays +
                ", openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", stationary=" + stationary +
                ", itinerant=" + itinerant +
                ", products='" + products + '\'' +
                '}';
    }
}




