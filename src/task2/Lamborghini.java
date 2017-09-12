/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author Isaac
 */
public class Lamborghini extends SuperCar {
    private String dealerName;
    private String licensePlate;
    private String vin;

    public String getDealerName() {
        return dealerName;
    }

    public void setDealerName(String dealerName) {
        if(dealerName != null){
            this.dealerName = dealerName;
        } else {
            throw new IllegalArgumentException("Name of dealer the car was purchased at is required");
        }
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        if(licensePlate != null){
            this.licensePlate = licensePlate;
        } else {
            throw new IllegalArgumentException("License plate is required");
        }
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        if((vin != null) && ((vin.length() == 17 && this.getYear() >= 1981) || (vin.length() >= 11 && vin.length() <= 17 && this.getYear() < 1981))){
            this.vin = vin;
        } else {
            throw new IllegalArgumentException("VIN is required");
        }
    }
}
