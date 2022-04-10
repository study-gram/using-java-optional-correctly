package kr.springboot.examples.ex12;

import java.util.Optional;

/**
 * Avoid Chaining Optional's Methods With the Single Purpose of Getting a Value
 * 값을 얻는 단일 목적으로 옵셔널의 메서드를 연결하지 마라
 */
public class App {

    /**
     * Sometimes, we tend to "over-use" things.
     * Meaning that we have a thing, like Optional, and we see a use case for it everywhere.
     * In the case of Optional, a common scenario involves chaining its methods for the single purpose of getting a value.
     * Avoid this practice and rely on simple and straightforward code.
     */

    // Avoid
    public String fetchStatusAvoid() {
        String status = "UNKNOWN";
        return Optional.ofNullable(status).orElse("PENDING");
    }

    // Prefer
    public String fetchStatusPrefer() {
        String status = "KNOWN";
        return status == null ? "PENDING" : status;
    }

}
