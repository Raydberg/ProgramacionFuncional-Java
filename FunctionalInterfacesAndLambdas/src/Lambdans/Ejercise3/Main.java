package Lambdans.Ejercise3;

public class Main {
    public static void main(String[] args) {
        LegnthOfString case1 = str -> {
            int l = str.length();
            System.out.println("The length of the givel String is " + l);
            return l;
        };

        case1.ofLegth("Hola");
    }
}
