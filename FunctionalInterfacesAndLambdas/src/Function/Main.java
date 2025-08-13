package Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
//        Function<String, Integer> extractLength = title -> title.length();
//        Integer titleLength = extractLength.apply("Hola Mundo");
//
//        BiFunction<Double, Double, Integer> divider = (num1, num2) -> (int) (num1 / num2);
//        System.out.println(divider.apply(10.8, 10.6));
        List<String> list = List.of("Kit", "Kat", "Shake");
        Function<String, Integer> function = String::length;
        List<Integer> newList = map(list, function);



    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> newList = new ArrayList<>();
        for (T e : list) {
            newList.add(function.apply(e));
        }
        return newList;
    }

}
