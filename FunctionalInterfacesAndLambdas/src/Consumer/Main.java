package Consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        //Instancia mediente clases anonimas
        Consumer<String> printer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        printer.accept("Hola Mundo");

        //Lambdas

        Consumer<String> printer1 = s -> System.out.println(s);
        Consumer<String> printer2 = s -> System.out.println(s);
        Consumer<String> printer12 = printer1.andThen(printer2);
        printer12.accept("Adios");

        var names =  new ArrayList<String>();
        names.add("Name1");
        names.add("Name2");
        names.add("Name3");
       names.forEach(name -> System.out.println("Hola "+name));
    }
}
