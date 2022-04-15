package kr.springboot.examples.ex22;

import java.util.Optional;

/**
 * Transform Values Via Map() and flatMap()
 * Map()과 flatMap()을 통해 값을 변환하라
 */
public class App1 {

    // Avoid
    public void avoidExample() {

        Optional<String> lowerName = Optional.of("mr.lee");

        Optional<String> upperName = Optional.of("MR.LEE");

        if (lowerName.isPresent()) {
            upperName = Optional.of(lowerName.get().toLowerCase());
        } else {
            upperName = Optional.empty();
        }

    }

    // Prefer
    public void preferExample() {

        Optional<String> lowerName = Optional.of("mr.lee");

        Optional<String> upperName = lowerName.map(String::toUpperCase);

    }

}
