/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

/**
 *
 * @author Isaac
 */
public class Lamborghini extends SuperCar {
    private String dealerName;
    private String licensePlate;

    public Lamborghini(int year, String model, String transmission) {
        setManufacturer("Lamborghini");
        setModel(model);
        setYear(year);
        setTransmissionType(transmission);
    }

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
}