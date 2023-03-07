package application;

public class Dolar extends Currency {

    public Dolar() {
        super();
    }

    //converts the value using the conversion rate of 05/03/23
    @Override
    public double conversion() {
        double convRate = 5.20;
        return convRate * value;
    }

    //toString method to display on the lists
    @Override
    public String toString() {
        return "Dolar: " + value;
    }

}
