/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.strategymiranda.utils;

import java.util.ArrayList;
import org.bson.Document;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public abstract class DataPersistance {
    public abstract void insert(String collectionName, String json);
    public abstract ArrayList read(String collectionName);
    public abstract Document find(String collectionName,String keyName,String fieldValue);
    public abstract boolean update(String collectionName, String fieldNameToSearch, String valueToSearch,
        String fieldNameToUpdate, String valueToUpdate);
}