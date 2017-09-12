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
    private boolean registrationRequired;
    private boolean running;
    private boolean off;
    
    public String getPowerSource(){
        return "motor";
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isRegistrationRequired() {
        return registrationRequired;
    }

    public void setRegistrationRequired(boolean registrationRequired) {
        this.registrationRequired = registrationRequired;
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
