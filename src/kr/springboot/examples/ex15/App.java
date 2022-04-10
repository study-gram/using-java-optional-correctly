package kr.springboot.examples.ex15;

import java.util.Optional;

/**
 * Do Not Use Optional in Setters Arguments
 * Setter 에서 옵셔널을 사용하지 마세용
 */
public class App {

    // Avoid
    private Optional<String> postcodeAvoid;

    // Avoid
    public Optional<String> getPostcodeAvoid() {
        return postcodeAvoid;
    }

    // Avoid
    public void setPostcodeAvoid(Optional<String> postcode) {
        this.postcodeAvoid = postcode;
    }

    // Prefer
    private String postcodePrefer;

    // Prefer
    public Optional<String> getPostcodePrefer() {
        return Optional.ofNullable(postcodePrefer);
    }

    // Prefer
    public void setPostcodePrefer(String postcode) {
        this.postcodePrefer = postcode;
    }

}
