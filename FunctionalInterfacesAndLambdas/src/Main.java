import Lambdans.MyFunInterface;

public class Main {
    public static void main(String[] args) {
        MyFunInterface fun = () -> System.out.println("Hello");
        fun.myMethod();

        onTheFly(() -> System.out.println("Hello"));
    }

    public static void onTheFly(MyFunInterface fun) {
        fun.myMethod();
    }

}
