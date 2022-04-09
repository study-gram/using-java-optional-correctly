package kr.springboot.examples.ex9;

import java.util.Optional;

/**
 * Consume an Optional if it Is Present. If it Is Not Present, Then Execute an Empty-Based Action. This Is a Job For Optional.ifPresentElse(), Java 9.
 * Optional이 있으면 사용하고 존재하지 않으면 Empty 기반 작업을 해라. 이것은 Optional.ifPresentElse() / Java 9 이상
 */
public class App {

    // Avoid
    public void avoidExample() {
        Optional<String> status = Optional.empty();
        if (status.isPresent()) System.out.println("Status: " + status.get());
        else System.out.println("Status not found");
    }

    // Prefer
    public void preferExample() {
        Optional<String> status = Optional.empty();
        status.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("Status not found")
        );
    }

}
