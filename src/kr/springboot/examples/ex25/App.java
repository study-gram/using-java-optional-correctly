package kr.springboot.examples.ex25;

import kr.springboot.examples.commons.Product;

import java.util.Optional;

/**
 * Avoid Using Identity-Sensitive Operations on Optionals
 * 옵셔널에 대한 신원 감지 연산 사용을 피하라
 */
public class App {

    // Avoid
    public void avoidExample() {

        Product product = new Product();
        Optional<Product> op1 = Optional.of(product);
        Optional<Product> op2 = Optional.of(product);

        // op1 == op2 => false, expected true
        if (op1 == op2) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

    }

    // Prefer
    public void preferExample() {

        Product product = new Product();
        Optional<Product> op1 = Optional.of(product);
        Optional<Product> op2 = Optional.of(product);

        // op1.equals(op2) => true,expected true
        if (op1.equals(op2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

    // 절때 하지 말아야 할 것
    public void neverDoThat() {

        Optional<Product> product = Optional.of(new Product());

        synchronized(product) {

            System.out.println(product.get().getName());

        }

    }

}
