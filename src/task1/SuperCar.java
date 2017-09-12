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
public class SuperCar extends Vehicle{
    private int numDoors;
    private int numSeats;
    private String transmissionType;
    private int horsepower;
    private int torque;
    private String engineClassification;
    private String model;
    private int year;
    private double baseMSRP;
    
    @Override
    public double get0To60Time(){
        return 2.4;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        if(numDoors == 2 || numDoors == 4){
            this.numDoors = numDoors;
        } else {
            throw new IllegalArgumentException("Super cars are typically 2-door or 4-door");
        }
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        if(numSeats <= 5){
            this.numSeats = numSeats;
        } else {
            throw new IllegalArgumentException("Most super cars have 2 or 4 seats, though some ultra-luxury sedans and SUVs seat 5");
        }
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        if(transmissionType != null){
            this.transmissionType = transmissionType;
        } else {
            throw new IllegalArgumentException("Transmission is required");
        }
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        if(horsepower >= 200){
            this.horsepower = horsepower;
        } else {
            throw new IllegalArgumentException("Super cars tend to have more power");
        }
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        if(torque >= 200){
            this.torque = torque;
        } else {
            throw new IllegalArgumentException("Super cars tend to have more force");
        }
    }

    public String getEngineClassification() {
        return engineClassification;
    }

    public void setEngineClassification(String engineClassification) {
        if(engineClassification != null){
            this.engineClassification = engineClassification;
        } else {
            throw new IllegalArgumentException("It has to have an engine or electric motor");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model != null){
            this.model = model;
        } else {
            throw new IllegalArgumentException("Model is required");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year > 1920){
            this.year = year;
        } else {
            throw new IllegalArgumentException("Year must be newer than 1920");
        }
    }

    public double getBaseMSRP() {
        return baseMSRP;
    }

    public void setBaseMSRP(double baseMSRP) {
        if(baseMSRP >= 60000.00){
            this.baseMSRP = baseMSRP;
        } else {
            throw new IllegalArgumentException("Super cars are normally pretty expensive");
        }
    }    
}