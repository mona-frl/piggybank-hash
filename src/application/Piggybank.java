package application;

import java.util.ArrayList;

public class Piggybank {

    ArrayList<Currency> currencyArrayList = new ArrayList<>();

    //adds the currency to the array
    public void add(Currency currency, double value) {
        System.out.print("\n");
        //verifies the value to be higher than 0 then treats it correctly, if it's higher it will add else displays
        //invalid input
        if (value > 0) {
            currency.setValue(value);
            currencyArrayList.add(currency);
            System.out.println("-----------------------------------------------");
            System.out.println("Coin was succesfully added to your piggy bank!");
            System.out.println("-----------------------------------------------\n");
        } else {
            System.out.println("-----------------------------------------------");
            System.out.println("Invalid value.");
            System.out.println("-----------------------------------------------\n");
        }
    }

    //removes the currency from the array
    public void remove(Currency currency, double value) {
        //verifies the value to be higher than 0  & checks if it's a valid value from the array (checking the
        // values using equals and comparing the hashcode then treats it correctly,
        // if it's higher it will add else displays invalid input
        double coinValue = currency.getValue();
        System.out.print("\n");
        if (value == coinValue && value > 0) {
            currencyArrayList.remove(currency);
            System.out.println("-----------------------------------------------");
            System.out.println("Coin was succesfully removed from your piggy bank!");
            System.out.println("-----------------------------------------------\n");
        } else {
            System.out.println("-----------------------------------------------");
            System.out.println("Coin and/or invalid value.");
            System.out.println("-----------------------------------------------\n");
        }
    }

    //lists the coins added using a forloop, it will show all coins add without the total (used this method to
    //list before the remove method
    public void list() {
        System.out.print("\n");
        System.out.println("Piggy Bank's coins:");
        for (Currency currency : currencyArrayList) {
            System.out.println(currency);
        }
        System.out.print("\n");
    }


    //lists all the coins and adds the total of ALL coins without conversion rate
    public void listarTotal() {
        double total = 0;
        System.out.print("\n");
        System.out.println("Piggy Bank's coins:");
        for (Currency currency : currencyArrayList) {
            System.out.println(currency);
            total += currency.value;
        }
        System.out.print("\n");
        System.out.println("-----------------------------------------------");
        System.out.println("Total (without conversion rate): " + total);
        System.out.println("-----------------------------------------------\n");
    }


    //lists all the coins and adds the total of ALL coins with conversion rate
    public void convertAll() {
        double total = 0;
        System.out.print("\n");
        System.out.println("Piggy Bank's coins:");
        for (Currency currency : currencyArrayList) {
            double convertedCoin = currency.conversion();
            total += convertedCoin;
            System.out.println( currency + " => BRL: " + convertedCoin);
        }
        System.out.print("\n");
        System.out.println("-----------------------------------------------");
        System.out.println("Total (with conversion rate): " + total);
        System.out.println("-----------------------------------------------\n");
    }
}
