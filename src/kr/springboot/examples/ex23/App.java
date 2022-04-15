package kr.springboot.examples.ex23;

import kr.springboot.examples.commons.User;

import java.util.Optional;

/**
 * Reject Wrapped Values Based on a Predefined Rule Using filter()
 * filter()를 사용하여 미리 정의된 규칙에 따라 래핑된 값 거부하기
 */
public class App {

    // Avoid
    public boolean validatePasswordLengthAvoidExample(User userId) {

        Optional<String> password = Optional.of("MR.LEE***"); // User password

        if (password.isPresent()) {
            return password.get().length() > 5;
        }

        return false;
    }

    // Prefer
    public boolean validatePasswordLengthPreferExample() {

        Optional<String> password = Optional.of("IM A GOD****"); // GOD IS ME

        return password
                .filter(p -> p.length() > 5)
                .isPresent();

    }

}
