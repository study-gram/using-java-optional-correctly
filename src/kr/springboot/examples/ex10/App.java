package kr.springboot.examples.ex10;

import java.util.Optional;

/**
 * When the Value Is Present, Set/Return That Optional. When No Value Is Present, Set/Return the Other Optional. This Is a Job For Optional.or(), Java 9.
 * 값이 있을 때 해당 값을 선택적으로 설정또는 반환하고 값이 없는 경우 기타 옵션을 설정또는 반환해라. 이것은 Optional.or() 을 위한 작업임. / Java 9 이상.
 */
public class App {

    // Avoid
    public Optional<String> fetchStatusAvoidExample() {

        Optional<String> status = Optional.empty() ;
        Optional<String> defaultStatus = Optional.of("PENDING");

        if (status.isPresent()) {
            return status;
        } else {
            return defaultStatus;
        }
    }

    // Avoid 2
    /*public Optional<String> fetchStatus() {

        Optional<String> status = ... ;

        return status.orElseGet(() -> Optional.<String>of("PENDING"));
    }*/

    // Prefer
    public Optional<String> fetchStatusPreferExample() {

        Optional<String> status = Optional.empty();
        return status.or(() -> Optional.of("PENDING"));

    }


}
