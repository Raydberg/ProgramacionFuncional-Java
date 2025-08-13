package Predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Predicate<String> validateName = name -> name.length() > 5;
//        List<String> names = List.of("Ryan", "Patricia", "Eva");
//        for (String name : names) {
//            if (validateName.test(name))
//                System.out.println(name);
//        }
//
//        names.stream()
//                .filter(name -> name.length() > 5)
//                .forEach(System.out::println);
        List<String> list = new ArrayList<>();
        list.add("Basics");
        list.add("");
        list.add("Strong");
        list.add("");

        // Declaramos codicion
        Predicate<String> predicate = s -> !s.isEmpty();
        List<String> newList = filterList(list, predicate);
        System.out.println(newList);

        Predicate<String> filter = s -> s.contains("Basics");
        List<String> filteredList = filterList(list, filter);
        System.out.println(filteredList);


        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6, 6, 7, 8);
        Predicate<Integer> integerFilter = i -> i % 2 == 0;
        List<Integer> evens = filterList(intList, integerFilter);
        System.out.println(evens);
    }

    private static <T> List<T> filterList(List<T> list, Predicate<T> predicate) {
        List<T> newList = new ArrayList<>();
        for (T string : list) {
            if (predicate.test(string)) {
                newList.add(string);
            }
        }
        return newList;
    }
}
