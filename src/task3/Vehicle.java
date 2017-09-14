/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author Isaac
 */
public interface Vehicle {
    public abstract String get0To60Time();

    public abstract String getManufacturer();

    public abstract void setManufacturer(String manufacturer);
    
    public abstract String getModel();

    public abstract void setModel(String model);
    
    public abstract int getYear();

    public abstract void setYear(int year);
    
    public abstract double getBaseMSRP();

    public abstract void setBaseMSRP(double baseMSRP);

    public abstract boolean isRunning();

    public abstract void setRunning(boolean running);
}