package kr.springboot.examples.ex4;

import java.util.Optional;

/**
 * When No Value Is Present, Set/Return a Non-Existent Default Object Via the Optional.orElseGet() Method
 * 값이 없을 때 Optional.orElseGet() 메서드를 통해 존재하지 않는 기본 개체를 설정또는 반환해라
 */
public class App {

    public String computeStatus() {
        return "UNKNOWN";
    }

    // Avoid
    public String findUserStatusAvoidExample() {
        Optional<String> status = Optional.empty();
        if (status.isPresent()) return status.get();
        else return computeStatus();
    }

    // Prefer
    public String findUserStatusPreferExample() {
        Optional<String> status = Optional.empty();
        return status.orElseGet(this::computeStatus);
    }

}
