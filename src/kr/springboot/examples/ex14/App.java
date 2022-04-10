package kr.springboot.examples.ex14;

import java.util.Objects;
import java.util.Optional;

/**
 * Do Not Use Optional in Constructors Arguments
 * 생성자 인수에서 옵셔널을 사용하지 마랏
 */
public class App {

    private final String name;

    // Avoid
    private final Optional<String> postCodeAvoid;

    // Avoid
    public App(String name, Optional<String> postCode) {
        this.name = Objects.requireNonNull(name, () -> "이름은Null일수없음.");
        this.postCodeAvoid = postCode;
        postCodePrefer = null;
    }

    // Prefer
    private final String postCodePrefer;

    // Prefer
    public App(String name, String postCodePrefer) {
        this.name = name;
        this.postCodePrefer = postCodePrefer;
        postCodeAvoid = null;
    }


}
