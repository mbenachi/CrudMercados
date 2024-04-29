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
    private boolean fruit;
    private boolean porkMeat;
    private boolean cowMeat;
    private boolean fish;
    private boolean vegetables;

    //Constructores

    public Markets() {
    }

    public Markets(Long id, String name, String address, Set<DayOfWeek> openingDays, LocalTime openingTime,
                   LocalTime closingTime, boolean stationary, boolean itinerant, boolean fruit, boolean porkMeat,
                   boolean cowMeat, boolean fish, boolean vegetables) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.openingDays = openingDays;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.stationary = stationary;
        this.itinerant = itinerant;
        this.fruit = fruit;
        this.porkMeat = porkMeat;
        this.cowMeat = cowMeat;
        this.fish = fish;
        this.vegetables = vegetables;
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

    public boolean isFruit() {
        return fruit;
    }

    public void setFruit(boolean fruit) {
        this.fruit = fruit;
    }

    public boolean isPorkMeat() {
        return porkMeat;
    }

    public void setPorkMeat(boolean porkMeat) {
        this.porkMeat = porkMeat;
    }

    public boolean isCowMeat() {
        return cowMeat;
    }

    public void setCowMeat(boolean cowMeat) {
        this.cowMeat = cowMeat;
    }

    public boolean isFish() {
        return fish;
    }

    public void setFish(boolean fish) {
        this.fish = fish;
    }

    public boolean isVegetables() {
        return vegetables;
    }

    public void setVegetables(boolean vegetables) {
        this.vegetables = vegetables;
    }


    //ToString


    @Override
    public String toString() {
        return "Markets{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", openingDays=" + openingDays +
                ", openingTime=" + openingTime +
                ", closingTime=" + closingTime +
                ", stationary=" + stationary +
                ", itinerant=" + itinerant +
                ", fruit=" + fruit +
                ", porkMeat=" + porkMeat +
                ", cowMeat=" + cowMeat +
                ", fish=" + fish +
                ", vegetables=" + vegetables +
                '}';
    }
}




