package org.javacourse.service;

import org.javacourse.dto.Motorcycle;
import org.javacourse.dto.Warranty;

import java.util.Date;
import java.util.List;

public class WarrantyService {

  private boolean validationOfWarranty;
  private List<Warranty> warrantyList;


    public List<Warranty> getWarrantyList() {
        return warrantyList;
    }

    public void createWarranty(int purchaseNumber, Date purchaseDate, int duration) {
        Warranty warranty = new Warranty(purchaseNumber, purchaseDate, duration);
            warrantyList.add(warranty);
    }
//    TODO: UPDATE WARRANTY ;
//          CHECK IF WARRANTY IS VALID;
//          DELETE WARRANTY;

    public void updateWarranty (int purchaseNumber, Date purchaseDate, int duration){

    }
}


