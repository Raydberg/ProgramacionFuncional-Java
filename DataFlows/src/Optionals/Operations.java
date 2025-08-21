package Optionals;

import java.util.Optional;

public class Operations {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Value");

        //map()
        // Si existe el valor retorna el elemento transformado
        String orElse = optional.map(val -> "Replaces").orElse("Empty");
        System.out.println(orElse);
       //filter

        Optional<String> filter = optional.filter(val -> val.equalsIgnoreCase("Value"));
        System.out.println(filter.get());

        //FlatMap

        Optional<String> flatMap = optional.flatMap(val -> Optional.of("Replaces by FlatMap"));
        System.out.println(flatMap.get());


    }
}
