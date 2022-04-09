package kr.springboot.examples.ex2;

import kr.springboot.examples.commons.Cart;

import java.util.Optional;

/**
 * Ensure That an Optional Has a Value Before Calling Optional.get()
 * Optional.get() 호출 전 Optional 값 확인 하기
 */
public class App {

    // Avoid
    public void AvoidExample() {
        Optional<Cart> cart = Optional.empty();
        Cart myCart = cart.get();
    }

    // 권장
    public void PreferExample() {
        Optional<Cart> cart = Optional.empty();
        if (cart.isPresent()) {
            Cart myCart = cart.get();
        } else {

        }
    }

}
