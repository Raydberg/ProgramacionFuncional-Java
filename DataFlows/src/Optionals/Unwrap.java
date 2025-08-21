package Optionals;

import java.util.Optional;

public class  Unwrap {
    public static void main(String[] args) {
        Integer a = 10;
        Optional<Integer> optional = Optional.of(a);
        //get
        Integer intervalVal = optional.get();
        System.out.println(intervalVal);

        Optional<Integer> emptyOptional = Optional.empty();
//        emptyOptional.get(); //-> Da error

        // isPresent
        Integer val = emptyOptional.isPresent() ? emptyOptional.get() : 0;
        System.out.println(val);

        // orElse , orElseGet

        Integer orElse = emptyOptional.orElse(0);
        System.out.println(orElse);

        //orElseGet

        Integer orElseGet = emptyOptional.orElseGet(() -> 0);
        System.out.println(orElseGet);

        // Si queremos devolver algun error
        // orElseThrow

        Integer orElseThrow = emptyOptional.orElseThrow(() -> new IllegalArgumentException());
        System.out.println(orElseThrow);
    }
}
