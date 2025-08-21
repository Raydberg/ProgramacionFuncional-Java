package Optionals;

import java.util.Optional;

public class OptionalMain {
    public static void main(String[] args) {
        String val = "A string";

        Optional<String> optional = Optional.of(val);
        //Empty
        Optional<Integer> empty = Optional.empty();
        // Nullable
        Optional<String> nullable = Optional.ofNullable(val);
        Optional<String> emptyOptional = Optional.ofNullable(null);
    }
}
