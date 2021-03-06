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
public class SuperCar extends Vehicle{
    private int numDoors;
    private int numSeats;
    private String transmissionType;
    private int horsepower;
    private int torque;
    private String engineClassification;
    
    @Override
    public String get0To60Time(){
        switch (engineClassification.toLowerCase()){
            case "4 cylinder":
                return "7.0+ seconds";
            case "v6":
                return "5.1 - 8.0 seconds";
            case "v8":
                return "3.7 - 7.6 seconds";
            case "v10":
                return "2.9 - 6.6 seconds";
            case "v12":
                return "2.4 - 4.9 seconds";
            case "w12":
                return "2.2 - 4.4 seconds";
            case "electric":
            case "electric motor":
            case "ev":
                return "2.4 - 12.0 seconds";
            default:
                return "Engine Classification Required (4 Cylinder, V6, V8, V10, V12, W12, or electric motor)";
        }
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
            throw new IllegalArgumentException("It has to have an engine (4 Cylinder, V6, V8, V10, V12, or W12) or electric motor");
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        sb.append(getYear() + " " + getManufacturer() + " " + getModel());
        sb.append("\nEngine Specs: " + getEngineClassification() + " " + getHorsepower() + "hp " + getTorque() + "lb-ft");
        sb.append("\nTransmission: " + getTransmissionType());
        sb.append("\nOriginal Base MSRP: $" + getBaseMSRP());
        
        return sb.toString();
    }
}
