package kr.springboot.examples.ex6;

import java.util.Optional;

/**
 * When No Value Is Present, Throw an Explicit Exception Via orElseThrow(Supplier<? extends X> exceptionSupplier)
 * 값이 없으면 orElseThrow(Supplier<? extends X> exceptionSupplier)를 통해 명시적 예외를 던져라.
 */
public class App {

    // Avoid
    public String findUserStatusAvoid(Long id) {
        Optional<String> status = Optional.empty();
        if (status.isPresent()) return status.get();
        else throw new IllegalStateException();
    }

    //Prefer
    public String findUserStatusPrefer(Long id) {
        Optional<String> status = Optional.empty();
        String result = status.orElseThrow(IllegalStateException::new);
        return result;
    }

}
