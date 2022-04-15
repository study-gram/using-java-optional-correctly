package kr.springboot.examples.ex22;

import kr.springboot.examples.commons.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App2 {

    String name;

    // getName() return a non-null String
    public String getName() {
        return name;
    }

    // Avoid
    public void avoidExample() {

        List<Product> products = new ArrayList<>();

        Optional<Product> product = products.stream()
                .filter(p -> p.getPrice() < 50)
                .findFirst();

        if (product.isPresent()) {
            name = product.get().getName().toUpperCase();
        } else {
            name = "없다.";
        }

    }

    // Prefer
    public void preferExample() {

        List<Product> products = new ArrayList<>();

        name = products.stream()
                .filter(p -> p.getPrice() < 50)
                .findFirst()
                .map(Product::getName)
                .map(String::toUpperCase)
                .orElse("없다");

    }


}
