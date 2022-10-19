package src.application;

import src.entities.Product;
import src.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Program {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Mouse", 54.90 ));
        list.add(new Product("Monitor", 234.93 ));
        list.add(new Product("Xbox", 1190.99 ));
        list.add(new Product("Keyboard", 90.99 ));

        Double x = 1.1;

        list.forEach(p -> p.setPrice(p.getPrice() * x));
        list.forEach(System.out::println);

    }
}
