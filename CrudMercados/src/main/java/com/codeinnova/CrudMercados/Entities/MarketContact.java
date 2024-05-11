package com.codeinnova.CrudMercados.Entities;

import jakarta.persistence.Embeddable;

@Embeddable
public class MarketContact {

    private String email;
    private Long phone;

    //CONSTRUCTORES

    public MarketContact() {
    }

    public MarketContact(String email, Long phone) {
        this.email = email;
        this.phone = phone;
    }

    //GETTER AND SETTER

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    //TO STRING

    @Override
    public String toString() {
        return "MarketContact{" +
                "email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
