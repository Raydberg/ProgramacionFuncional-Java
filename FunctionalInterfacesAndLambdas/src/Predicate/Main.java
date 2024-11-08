package Predicate;

import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> validateName = name -> name.length() > 5;
        List<String> names = List.of("Ryan", "Patricia", "Eva");
        for (String name : names) {
            if (validateName.test(name))
                System.out.println(name);
        }

        names.stream()
                .filter(name -> name.length() > 5)
                .forEach(System.out::println);


    }
}
