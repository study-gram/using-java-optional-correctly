package kr.springboot.examples.ex3;

import java.util.Optional;

/**
 * When No Value Is Present, Set/Return an Already-Constructed Default Object Via the Optional.orElse() Method
 * 값이 없을 때 Optional.orElse() 메서드를 통해 이미 귀성된 기본 객체를 설정 또는 반환 해라
 */
public class App {

    public static final String USER_STATUS = "UNKNOWN";

    // Avoid
    public String findUserStatusAvoidExample(Long id) {

        Optional<String> status = Optional.empty();

        if (status.isPresent()) return status.get();
        else return USER_STATUS;

    }

    // Prefer
    public String findUserStatusPreferExample(Long id) {
        Optional<String> status = Optional.empty();
        return status.orElse(USER_STATUS);
    }

}
