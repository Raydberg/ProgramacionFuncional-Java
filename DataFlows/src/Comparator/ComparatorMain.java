package Comparator;

import java.util.Comparator;

public class ComparatorMain {
    public static void main(String[] args) {

        var producto1 = new Product("1", "Producto1", 49.99, false);
        var producto2 = new Product("2", "Producto2", 19.99, false);

        Comparator<Double> comparator1 = (n1, n2) -> n1.compareTo(n2);
        Comparator<Double> comparator2 = Double::compareTo;

        Comparator<Product> productComparator = (p1, p2) -> p1.getPrice().compareTo(producto2.getPrice());
        productComparator.compare(producto1,producto2);
    }
}
