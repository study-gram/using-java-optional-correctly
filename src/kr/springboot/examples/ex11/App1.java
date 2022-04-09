package kr.springboot.examples.ex11;

import kr.springboot.examples.commons.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Optional.orElse/ orElseXXX Are a Perfect Replacement for isPresent()-get() Pair in Lambdas
 * Optional.orElse/orElseXXX는 람다에서 isPresent()-get() 쌍을 완벽하게 대체한다.
 */
public class App1 {

    // Avoid 1
    public String avoidExample1() {

        int price = 10000;

        List<Product> products = new ArrayList<>();

        Optional<Product> product = products.stream()
                .filter(p -> p.getPrice() < price)
                .findFirst();

        if (product.isPresent()) return product.get().getName();
        else return "NOT FOUND";

    }

    // Avoid 2
    public String avoidExample2() {

        int price = 10000;

        List<Product> products = new ArrayList<>();

        Optional<Product> product = products.stream()
                .filter(p -> p.getPrice() < price)
                .findFirst();

        return product.map(Product::getName)
                .orElse("NOT FOUND");

    }

    // Prefer 1
    public String preferExample1() {

        int price = 10000;

        List<Product> products = new ArrayList<>();

        return products.stream()
                .filter(p -> p.getPrice() < price)
                .findFirst()
                .map(Product::getName)
                .orElse("NOT FOUND");

    }

}
