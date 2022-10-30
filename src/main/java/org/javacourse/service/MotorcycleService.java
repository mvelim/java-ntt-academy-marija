package org.javacourse.service;

import org.javacourse.dto.Customer;
import org.javacourse.dto.Motorcycle;

import java.util.List;
import java.util.stream.Collectors;

public class MotorcycleService {
    private List<Motorcycle> motorcycles;

    public List<Motorcycle> getMotorcycles() {
        return motorcycles;
    }

    public void setMotorcycles(List<Motorcycle> motorcycles) {
        this.motorcycles = motorcycles;
    }

    public Motorcycle newMotorcycle (String vin, int modelYear, int mileage){
        Motorcycle newMotorcycle = new Motorcycle(vin, modelYear, mileage, false);
        motorcycles.add(newMotorcycle);
        return newMotorcycle;
    }
    //TODO : UPDATE MILEAGE ; - done
    //      MARK VEHICLE AS STOLEN; - done

    public void updateMileage (String vin, int modelYear, int mileage) {
        motorcycles.stream()
                .filter(c -> vin.equals(c.getVin()))
                .peek(c -> c.setMileage(mileage))
                .collect(Collectors.toList());
    }
    public void stolenMotorcycle (String vin, int modelYear, int mileage) {
        motorcycles.stream()
                .filter(c -> vin.equals(c.getVin()))
                .peek(c -> c.setStolen(true))
                .collect(Collectors.toList());
    }
}
