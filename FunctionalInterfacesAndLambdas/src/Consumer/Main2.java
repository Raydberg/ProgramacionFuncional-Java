package Consumer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Main2 {
    public static void main(String[] args) {
//        BiConsumer<Integer, Integer> addTwo = (x, y) -> System.out.println(x + "" + y);
//        addTwo.accept(5, 10);
//
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "Name1");
//        map.put(2, "Name2");
//        map.put(3, "Name3");
//        map.put(4, "Name4");
//
//        map.forEach((key, value) -> {
//            System.out.println("Key : " + key);
//            System.out.println("Value : " + value);
//        });
        List<Integer> list = List.of(34, 56, 434, 67, 87, 34);
        Consumer<Integer> consumer = System.out::println;
//        consumer.accept(45);
        printElements(list, consumer);
    }

    private static <T> void printElements(List<T> list, Consumer<T> consumer) {
        for (T item : list) {
            consumer.accept(item);
        }
    }


}
