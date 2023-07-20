/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.q71100.model;

/**
 *
 * @author Alison Miranda, Bug Busters, DCCO-ESPE
 */
public class SoccerTeams {
    int id;
    String name;
    int numberOfPlayers;
    double feePerPlayer;
    double totalFee;

    public SoccerTeams(int id, String name, int numberOfPlayers, double feePerPlayer, double totalFee) {
        this.id = id;
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.feePerPlayer = feePerPlayer;
        this.totalFee = totalFee;
    }

    @Override
     public String toString() {
         return "SoccerTeams{" + 
                 "\nid=" + id + 
                 "\nname=" + name + 
                 "\nnumberOfPlayers=" + numberOfPlayers + 
                 "\nfeePerPlayer=" + feePerPlayer + 
                 "\ntotalFee=" + totalFee + '}';
     }


    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public double getFeePerPlayer() {
        return feePerPlayer;
    }

    public void setFeePerPlayer(double feePerPlayer) {
        this.feePerPlayer = feePerPlayer;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }
    
    
    
}
