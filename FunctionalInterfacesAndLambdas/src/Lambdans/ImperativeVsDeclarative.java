package Lambdans;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {
    public static void main(String[] args) {
        //Imperative

        int sumOfEvens = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                sumOfEvens = sumOfEvens + i;
            }
        }
        System.out.println(sumOfEvens);

        //Declarativo

        sumOfEvens = IntStream
                .rangeClosed(0, 100)
                .filter(n -> n % 2 == 0)
                .reduce(0, (elemt, acc) -> elemt + acc);


        System.out.println(sumOfEvens);

    }
}
