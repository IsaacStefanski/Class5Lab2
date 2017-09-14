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
public abstract class Vehicle {
    private String manufacturer;
    private String model;
    private int year;
    private double baseMSRP;
    private boolean running;
    
    public abstract String get0To60Time();

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        if(manufacturer != null){
            this.manufacturer = manufacturer;
        } else {
            throw new IllegalArgumentException("Manufacturer is required");
        }
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
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
