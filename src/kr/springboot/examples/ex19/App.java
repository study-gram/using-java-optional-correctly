package kr.springboot.examples.ex19;

import java.util.Optional;

/**
 * Do Not Confuse Optional.of() and Optional.ofNullable()
 * Optional.of()와 Optional.ofNullable()을 혼동하지 말자
 */
public class App {

    /**
     * Confusing or mistakenly using Optional.
     * of instead of Optional.ofNullable, or vice-versa, can lead to unpleasant issues.
     * As a key here, keep in mind that Optional.of(null) will throw NullPointerException,
     * while Optional.ofNullable(null) will result in an Optional.empty.
     *
     * Optional.of는 없으면 NPE 를 던지고 ofNullable은 빈 옵셔널을 준다. 혼동하지 말자
     */



    // Avoid
    public Optional<String> fetchItemNameAvoid(Long id) {

        String itemName = "HELLO";

        return Optional.of(itemName); // itemName이 Null 이면 NPE를 던짐.

    }

    // Prefer
    public Optional<String> fetchItemNamePrefer(Long id) {

        String itemName = "BYE";

        return Optional.ofNullable(itemName); // NPE 로 부터 자유로움

    }

}
