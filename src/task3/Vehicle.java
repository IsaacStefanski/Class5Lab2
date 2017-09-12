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
    public abstract double get0To60Time();

    public abstract String getManufacturer();

    public abstract void setManufacturer(String manufacturer);

    public abstract boolean isRunning();

    public abstract void setRunning(boolean running);

    public abstract boolean isOff();

    public abstract void setOff(boolean off);
}