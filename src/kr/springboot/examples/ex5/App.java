package kr.springboot.examples.ex5;

import java.util.NoSuchElementException;
import java.util.Optional;

/**
 * When No Value Is Present, Throw a java.util.NoSuchElementException Exception Via orElseThrow() Since Java 10
 * 값이 없으면 orElseThrow()를 통해 java.util.NoSuchElementException 예외를 던져라 / Java 10 이상
 */
public class App {

    // Avoid
    public String findUserStatusAvoid(Long id) {

        Optional<String> status = Optional.empty();

        if (status.isPresent()) return status.get();
        else throw new NoSuchElementException();

    }

    // Prefer
    public String findUserStatusPrefer(Long id) {

        Optional<String> status = Optional.empty();

        return status.orElseThrow();

    }

}
