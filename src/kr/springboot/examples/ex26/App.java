package kr.springboot.examples.ex26;

import kr.springboot.examples.commons.Cart;

import java.util.Optional;

/**
 * Return a boolean If The Optional Is Empty. Prefer Java 11, Optional.isEmpty()
 * Optional 이 비어 있으면 Boolean 을 반환하자 / Java 11 이상 Optional.isEmpty() 선호
 */
public class App {

    // Avoid
    public Optional<String> fetchCartItemsAvoid(long id) {

        String cart = null ; // this may be null

        return Optional.ofNullable(cart);

    }

    public boolean cartIsEmptyAvoid(long id) {

        Optional<String> cart = fetchCartItemsAvoid(id);

        return !cart.isPresent();

    }

    // Prefer
    public Optional<String> fetchCartItemsPrefer(long id) {

        String cart = null ; // this may be null
        return Optional.ofNullable(cart);
    }

    public boolean cartIsEmptyPrefer(long id) {

        Optional<String> cart = fetchCartItemsPrefer(id);

        return cart.isEmpty();
    }

}
