package application;

import java.util.Objects;

abstract class Currency {
    double value;

    public Currency() {
    }

    abstract double conversion();

    public double getValue() {
        return this.value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Currency currency)) return false;
        return Double.compare(currency.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
