package Interfaces.StaticMethods;

public interface Calculator {
    int suma(int a, int b);

    static Calculator getInstance() {
        return new BasicCalculatorImpl();
    }

}
