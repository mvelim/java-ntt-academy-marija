package org.javacourse.dto;

public class Motorcycle extends BaseDto {
    private String vin;
    private int modelYear;
    private int mileage;
    private boolean stolen = false;

    public Motorcycle(String vin, int modelYear, int mileage, boolean stolen) {
        this.vin = vin;
        this.modelYear = modelYear;
        this.mileage = mileage;
        this.stolen = stolen;
    }

    public Motorcycle(int id, String vin, int modelYear, int mileage) {
        this(vin, modelYear, mileage, false);
        super.setId(id);
    }

    public Motorcycle() {

    }

    @Override
    public String toString() {
        return "Motorcycle: " +
                "vin= '" + vin + '\'' +
                ", modelYear= " + modelYear +
                ", mileage= " + mileage +
                ", stolen= " + stolen ;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isStolen() {
        return stolen;
    }

    public void setStolen(boolean stolen) {
        this.stolen = stolen;
    }
}
