package kr.springboot.examples.ex1;

import kr.springboot.examples.commons.Cart;

import java.util.Optional;

/**
 *  Never Assign Null to an Optional Variable
 *  변수에 Null 할당 금지
 */
public class App {

    // Avoid
    public Optional<Cart> fetchCartAvoid() {

        Optional<Cart> emptyCart = null;
        return emptyCart;

    }

    // 권장
    public Optional<Cart> fetchCartPrefer() {

        Optional<Cart> emptyCart = Optional.empty();
        return emptyCart;

    }

}
