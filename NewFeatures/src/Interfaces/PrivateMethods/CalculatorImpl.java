package Interfaces.PrivateMethods;

public class CalculatorImpl implements Calculator {
    @Override
    public double sumPrices(double price1, double price2) {
        return price1 + price2;
    }
}
