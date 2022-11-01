package org.javacourse.service;

import org.javacourse.dto.Warranty;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;

public class WarrantyService {

  private boolean validationOfWarranty;
  private List<Warranty> warrantyList;
  private Date currentDate = new Date();


    public List<Warranty> getWarrantyList() {
        return warrantyList;
    }

    public void createWarranty(int purchaseNumber, Date purchaseDate, int duration) {
        Warranty warranty = new Warranty(purchaseNumber, purchaseDate, duration);
            warrantyList.add(warranty);
    }
    public void updateWarranty (int duration){
        warrantyList.stream()
                .forEach(warranty -> warranty.setDuration(duration));
    }
    public static boolean validWarrantyCheck (LocalDate purchaseDate, int duration){
        LocalDate currentDate = LocalDate.now();
        LocalDate warrantyDate = purchaseDate.plusMonths(duration);
        Period period = warrantyDate.until(currentDate);
        if (period.isNegative() || period.isZero()){
            System.out.println("Warranty expired");
        }
        else System.out.println("Remaining warranty months: " + period.getMonths());

        return false;
    }
//    TODO: DELETE WARRANTY; -repository

}


