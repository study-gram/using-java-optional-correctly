package kr.springboot.examples.ex8;

import java.util.Optional;

/**
 * Consume an Optional if it Is Present. Do Nothing if it Is Not Present. This Is a Job For Optional.ifPresent().
 * Optional이 있으면 사용하고 존재하지 않으면 아무것도 하지 마라. 이건 Optional.ifPresent()를 위한 것이다.
 */
public class App {

    /**
     * TheOptional.ifPresent()is a good alternative forisPresent()-get()
     * pair when you just need to consume the value. If no value is present then do nothing.
     */

    // Avoid
    public void avoidExample() {
        Optional<String> status = Optional.empty();
        if (status.isPresent()) System.out.println("Status: " + status.get());
    }

    // Prefer
    public void preferExample() {
        Optional<String> status = Optional.empty();
        status.ifPresent(System.out::println);
    }

}
