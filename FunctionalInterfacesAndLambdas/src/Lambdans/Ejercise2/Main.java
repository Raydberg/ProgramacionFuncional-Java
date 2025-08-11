package Lambdans.Ejercise2;

public class Main {
    public static void main(String[] args) {
//        CountStringLambdan s1 = (s) -> s.length();
        CountStringLambdan s1 = String::length;
        s1.count("Hola");

    }
}
