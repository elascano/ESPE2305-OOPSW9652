
package com.operartiongosling.taxes;

/**
 *
 * @author Sanmertin Jose, OOP-ERATION-GOSLING,DCC-ESPE
 */
public class ICETax {
    public static float computeCigarettesTax(int packages,int packsInPackage, int cigaretesInPack, float ICE){
        int totalCigarettes;
        float ICETotalCigarettes;
        totalCigarettes=packages*packsInPackage*cigaretesInPack;
        ICETotalCigarettes=ICE*totalCigarettes;
        return ICETotalCigarettes;
        
    }
    public static float computeNonAlcoholicDrink(float contentInCC,float suggarInALiter, float suggarInFruit, float ICE){
        float addedSuggar;
        float contentInLiters;
        float suggarPerLiters;
        float cotentInLiters;
        float suggarContentInLiters;
        float ICETotal;
        addedSuggar=suggarInALiter-suggarInFruit;
        contentInLiters=contentInCC/1000;
        suggarPerLiters=addedSuggar/100;
        suggarContentInLiters=contentInLiters*suggarPerLiters;
        ICETotal=suggarContentInLiters*ICE;
        return ICETotal;        
    }
    public static float computePlasticBagsTax(int packages,int packsInPackage, int bagsInPack, float ICE){
        int totalBags;
        float ICETotalBags;
        totalBags=packages*packsInPackage*bagsInPack;
        ICETotalBags=ICE*totalBags;
        return ICETotalBags;
    }
    public static float computeAlcoholTax(float contentInMilimeters, float alcoholicPercentage, float especificTax, float advaloremTax){
        float pureAlcohol;
        float subtotalTax;
        float subAdValoremTax;
        float ICETotalAlcohol;
        pureAlcohol=contentInMilimeters*(alcoholicPercentage+0.0F/100);
        subtotalTax=pureAlcohol*especificTax;
        subAdValoremTax=subtotalTax*advaloremTax;
        ICETotalAlcohol=subtotalTax+subAdValoremTax;
        return ICETotalAlcohol;
        
    }
    public static float computeAlcoholDrinkTax(float contentInMilimeters, float alcoholicPercentage, float especificTax, float advaloremTax){
        float pureAlcohol;
        float subtotalTax;
        float subAdValoremTax;
        float ICETotalAlcoholDrink;
        pureAlcohol=contentInMilimeters*alcoholicPercentage;
        subtotalTax=pureAlcohol*especificTax;
        subAdValoremTax=subtotalTax*advaloremTax;
        ICETotalAlcoholDrink=subtotalTax+subAdValoremTax;
        return ICETotalAlcoholDrink;
        
    }
    public static float computeBeerTax(float contentInMilimeters, float alcoholicPercentage, float especificTax, float advaloremTax){
        float pureAlcohol;
        float subtotalTax;
        float subAdValoremTax;
        float ICETotalBeer;
        pureAlcohol=contentInMilimeters*alcoholicPercentage;
        subtotalTax=pureAlcohol*especificTax;
        subAdValoremTax=subtotalTax*advaloremTax;
        ICETotalBeer=subtotalTax+subAdValoremTax;
        return ICETotalBeer;        
    }
       public static float computeBeerSmallIndustrieTax(float contentInMilimeters, float alcoholicPercentage, float especificTax, float advaloremTax){
        float pureAlcohol;
        float subtotalTax;
        float subAdValoremTax;
        float ICETotalBeer;
        pureAlcohol=contentInMilimeters*alcoholicPercentage;
        subtotalTax=pureAlcohol*especificTax;
        subAdValoremTax=subtotalTax*advaloremTax;
        ICETotalBeer=subtotalTax+subAdValoremTax;
        return ICETotalBeer;        
    }
       public static float computeBeerMediumIndustrieTax(float contentInMilimeters, float alcoholicPercentage, float especificTax, float advaloremTax){
        float pureAlcohol;
        float subtotalTax;
        float subAdValoremTax;
        float ICETotalBeer;
        pureAlcohol=contentInMilimeters*alcoholicPercentage;
        subtotalTax=pureAlcohol*especificTax;
        subAdValoremTax=subtotalTax*advaloremTax;
        ICETotalBeer=subtotalTax+subAdValoremTax;
        return ICETotalBeer;        
    }
        public static float computeBeerIndustrieTax(float contentInMilimeters, float alcoholicPercentage, float especificTax, float advaloremTax){
        float pureAlcohol;
        float subtotalTax;
        float subAdValoremTax;
        float ICETotalBeer;
        pureAlcohol=contentInMilimeters*alcoholicPercentage;
        subtotalTax=pureAlcohol*especificTax;
        subAdValoremTax=subtotalTax*advaloremTax;
        ICETotalBeer=subtotalTax+subAdValoremTax;
        return ICETotalBeer;        
    }
}