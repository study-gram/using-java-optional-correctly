package kr.springboot.examples.ex11;

import kr.springboot.examples.commons.Cart;
import kr.springboot.examples.commons.Product;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * Optional.orElse/ orElseXXX Are a Perfect Replacement for isPresent()-get() Pair in Lambdas
 * Optional.orElse/orElseXXX는 람다에서 isPresent()-get() 쌍을 완벽하게 대체한다.
 */
public class App2 {

    // Avoid
    public void avoidExample() {

        Optional<Cart> cart = Optional.empty();

        Product product = new Product();

        if (!cart.isPresent() || !cart.get().getItems().contains(product))
            throw new NoSuchElementException();

    }

    // Prefer
    public void preferExample() {

        Optional<Cart> cart = Optional.empty();
        Product product = new Product();

        cart.filter(c -> c.getItems().contains(product)).orElseThrow();

    }



}
