/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.shippingcalculator.controller;

import ec.edu.espe.shippingcalculator.model.ShippingStrategy;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class StandardShipping implements ShippingStrategy{
    @Override
    public double calculateShippingCost(double weight) {
        return 5.0 + (0.1 * weight);
    }
}
