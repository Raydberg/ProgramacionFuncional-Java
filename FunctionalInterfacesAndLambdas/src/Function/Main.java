package Function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Function<String, Integer> extractLength = title -> title.length();
        Integer titleLength = extractLength.apply("Hola Mundo");

        BiFunction<Double, Double, Integer> divider = (num1, num2) -> (int) (num1 / num2);
        System.out.println(divider.apply(10.8, 10.6));


    }
}
