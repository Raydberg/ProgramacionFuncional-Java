package Lambdans;

public class LambdaUnderTheHood {
    public static void main(String[] args) {
        /**
         * Esto genera dos archivos al momento de compilarse
         */
        MyFunInterface fun1 = new MyFunInterface() {
            @Override
            public void myMethod() {
                System.out.println("Implementacion one ");
            }
        };
        MyFunInterface fun2 = new MyFunInterface() {
            @Override
            public void myMethod() {
                System.out.println("Implementacion one ");
            }
        };
    }
}
