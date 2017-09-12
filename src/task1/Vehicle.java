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
public class Vehicle {
    private String manufacturer;
    private boolean running;
    private boolean off;
    
    public double get0To60Time(){
        return 0.00;
    }

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

    public boolean isOff() {
        return off;
    }

    public void setOff(boolean off) {
        this.off = off;
    }
}