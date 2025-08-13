import Lambdans.MyFunInterface;

public class Main {
    public static void main(String[] args) {
        FunctionalGenerics<String, String> fun = s -> s.substring(1, 5);
        System.out.println(fun.execute("HolaMundo"));

        FunctionalGenerics<String, Integer> fun1 = String::length;
        System.out.println(fun1.execute("Hola"));

    }

}
