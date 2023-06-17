/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.erationgosling.shoesales.model;

/**
 *
 * @author PabloEZurita
 */
public class PairOfShoes {
    private int id;
    private String make;
    private String mode;
    private float price;
    private float totalPrice;

    public PairOfShoes(int id, String make, String mode, float price, float totalPrice) {
        this.id = id;
        this.make = make;
        this.mode = mode;
        this.price = price;
        this.totalPrice = totalPrice;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the mode
     */
    public String getMode() {
        return mode;
    }

    /**
     * @param mode the mode to set
     */
    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the totalPrice
     */
    public float getTotalPrice() {
        return totalPrice;
    }

    /**
     * @param totalPrice the totalPrice to set
     */
    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "PairOfShoes{" + "id=" + id + ", make=" + make + ", mode=" + mode + ", price=" + price + ", totalPrice=" + totalPrice + '}';
    }

    
    
}
