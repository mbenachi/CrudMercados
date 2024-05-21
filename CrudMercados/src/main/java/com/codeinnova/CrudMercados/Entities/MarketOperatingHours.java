package com.codeinnova.CrudMercados.Entities;

import jakarta.persistence.Embeddable;

import java.time.LocalTime;

@Embeddable
public class MarketOperatingHours {

    private Boolean monday;
    private LocalTime openingMonday;
    private LocalTime closingMonday;
    private Boolean tuesday;
    private LocalTime openingTuesday;
    private LocalTime closingTuesday;
    private Boolean wednesday;
    private LocalTime openingWednesday;
    private LocalTime closingWednesday;
    private Boolean thursday;
    private LocalTime openingThursday;
    private LocalTime closingThursday;
    private Boolean friday;
    private LocalTime openingFriday;
    private LocalTime closingFriday;
    private Boolean saturday;
    private LocalTime openingSaturday;
    private LocalTime closingSaturday;
    private Boolean sunday;
    private LocalTime openingSunday;
    private LocalTime closingSunday;

    //CONSTRUCTORES

    public MarketOperatingHours() {
    }

    public MarketOperatingHours(Boolean monday, LocalTime openingMonday, LocalTime closingMonday, Boolean tuesday,
                                LocalTime openingTuesday, LocalTime closingTuesday, Boolean wednesday,
                                LocalTime openingWednesday, LocalTime closingWednesday, Boolean thursday,
                                LocalTime openingThursday, LocalTime closingThursday, Boolean friday, LocalTime openingFriday,
                                LocalTime closingFriday, Boolean saturday, LocalTime openingSaturday, LocalTime closingSaturday,
                                Boolean sunday, LocalTime openingSunday, LocalTime closingSunday) {
        this.monday = monday;
        this.openingMonday = openingMonday;
        this.closingMonday = closingMonday;
        this.tuesday = tuesday;
        this.openingTuesday = openingTuesday;
        this.closingTuesday = closingTuesday;
        this.wednesday = wednesday;
        this.openingWednesday = openingWednesday;
        this.closingWednesday = closingWednesday;
        this.thursday = thursday;
        this.openingThursday = openingThursday;
        this.closingThursday = closingThursday;
        this.friday = friday;
        this.openingFriday = openingFriday;
        this.closingFriday = closingFriday;
        this.saturday = saturday;
        this.openingSaturday = openingSaturday;
        this.closingSaturday = closingSaturday;
        this.sunday = sunday;
        this.openingSunday = openingSunday;
        this.closingSunday = closingSunday;
    }

    //GETTER AND SETTER

    public Boolean getMonday() {
        return monday;
    }

    public void setMonday(Boolean monday) {
        this.monday = monday;
    }

    public LocalTime getOpeningMonday() {
        return openingMonday;
    }

    public void setOpeningMonday(LocalTime openingMonday) {
        this.openingMonday = openingMonday;
    }

    public LocalTime getClosingMonday() {
        return closingMonday;
    }

    public void setClosingMonday(LocalTime closingMonday) {
        this.closingMonday = closingMonday;
    }

    public Boolean getTuesday() {
        return tuesday;
    }

    public void setTuesday(Boolean tuesday) {
        this.tuesday = tuesday;
    }

    public LocalTime getOpeningTuesday() {
        return openingTuesday;
    }

    public void setOpeningTuesday(LocalTime openingTuesday) {
        this.openingTuesday = openingTuesday;
    }

    public LocalTime getClosingTuesday() {
        return closingTuesday;
    }

    public void setClosingTuesday(LocalTime closingTuesday) {
        this.closingTuesday = closingTuesday;
    }

    public Boolean getWednesday() {
        return wednesday;
    }

    public void setWednesday(Boolean wednesday) {
        this.wednesday = wednesday;
    }

    public LocalTime getOpeningWednesday() {
        return openingWednesday;
    }

    public void setOpeningWednesday(LocalTime openingWednesday) {
        this.openingWednesday = openingWednesday;
    }

    public LocalTime getClosingWednesday() {
        return closingWednesday;
    }

    public void setClosingWednesday(LocalTime closingWednesday) {
        this.closingWednesday = closingWednesday;
    }

    public Boolean getThursday() {
        return thursday;
    }

    public void setThursday(Boolean thursday) {
        this.thursday = thursday;
    }

    public LocalTime getOpeningThursday() {
        return openingThursday;
    }

    public void setOpeningThursday(LocalTime openingThursday) {
        this.openingThursday = openingThursday;
    }

    public LocalTime getClosingThursday() {
        return closingThursday;
    }

    public void setClosingThursday(LocalTime closingThursday) {
        this.closingThursday = closingThursday;
    }

    public Boolean getFriday() {
        return friday;
    }

    public void setFriday(Boolean friday) {
        this.friday = friday;
    }

    public LocalTime getOpeningFriday() {
        return openingFriday;
    }

    public void setOpeningFriday(LocalTime openingFriday) {
        this.openingFriday = openingFriday;
    }

    public LocalTime getClosingFriday() {
        return closingFriday;
    }

    public void setClosingFriday(LocalTime closingFriday) {
        this.closingFriday = closingFriday;
    }

    public Boolean getSaturday() {
        return saturday;
    }

    public void setSaturday(Boolean saturday) {
        this.saturday = saturday;
    }

    public LocalTime getOpeningSaturday() {
        return openingSaturday;
    }

    public void setOpeningSaturday(LocalTime openingSaturday) {
        this.openingSaturday = openingSaturday;
    }

    public LocalTime getClosingSaturday() {
        return closingSaturday;
    }

    public void setClosingSaturday(LocalTime closingSaturday) {
        this.closingSaturday = closingSaturday;
    }

    public Boolean getSunday() {
        return sunday;
    }

    public void setSunday(Boolean sunday) {
        this.sunday = sunday;
    }

    public LocalTime getOpeningSunday() {
        return openingSunday;
    }

    public void setOpeningSunday(LocalTime openingSunday) {
        this.openingSunday = openingSunday;
    }

    public LocalTime getClosingSunday() {
        return closingSunday;
    }

    public void setClosingSunday(LocalTime closingSunday) {
        this.closingSunday = closingSunday;
    }

    //TOSTRING


    @Override
    public String toString() {
        return "MarketOperatingHours{" +
                "monday=" + monday +
                ", openingMonday=" + openingMonday +
                ", closingMonday=" + closingMonday +
                ", tuesday=" + tuesday +
                ", openingTuesday=" + openingTuesday +
                ", closingTuesday=" + closingTuesday +
                ", wednesday=" + wednesday +
                ", openingWednesday=" + openingWednesday +
                ", closingWednesday=" + closingWednesday +
                ", thursday=" + thursday +
                ", openingThursday=" + openingThursday +
                ", closingThursday=" + closingThursday +
                ", friday=" + friday +
                ", openingFriday=" + openingFriday +
                ", closingFriday=" + closingFriday +
                ", saturday=" + saturday +
                ", openingSaturday=" + openingSaturday +
                ", closingSaturday=" + closingSaturday +
                ", sunday=" + sunday +
                ", openingSunday=" + openingSunday +
                ", closingSunday=" + closingSunday +
                '}';
    }
}

