package supplier;

import java.util.Random;
import java.util.UUID;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<Double> generator = () -> Math.random();
        generator.get();
        Supplier<Integer> generator2 = () -> new Random().nextInt(500 + 1);
        generator2.get();

        Supplier<String> uuidGenerator = () -> UUID.randomUUID().toString();
        System.out.println(uuidGenerator.get());
        Supplier<Person> personGenerator = () -> new Person();
        personGenerator.get();
    }
}
