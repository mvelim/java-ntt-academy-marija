package org.javacourse.dto;

import java.util.Date;

public class Warranty extends BaseDto {
    private int purchaseNumber;

    private Date purchaseDate;
    private int duration;

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public int getPurchaseNumber() {
        return purchaseNumber;
    }

    public void setPurchaseNumber(int purchaseNumber) {
        this.purchaseNumber = purchaseNumber;
    }


    public Warranty(int purchaseNumber, Date purchaseDate, int duration) {
        this.purchaseNumber = purchaseNumber;
        this.purchaseDate = purchaseDate;
        this.duration = duration;
    }

    public Warranty(int id, int purchaseNumber, Date purchaseDate, int duration) {
        this(purchaseNumber, purchaseDate, duration);
        super.setId(id);
    }

    @Override
    public String toString() {
        return "Warranty: " +
                "purchaseNumber= " + purchaseNumber +
                ", purchaseDate= " + purchaseDate +
                ", duration= " + duration ;
    }


}
