package application;

public class Real extends Currency {

    public Real() {

    }

    @Override
    public double conversion() {
        double convRate = 1;
        return convRate * value;
    }

    @Override
    public String toString() {
        return "Real: " + value;
    }
}
