package kr.springboot.examples.ex21;

import java.util.Objects;
import java.util.Optional;

/**
 * There Is No Need to Unwrap Optionals for Asserting Equality
 * Equals 를 위해 Optional 을 풀 필요가 없다.
 */
public class App {

    /*  Optional.equals()source code:
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Optional)) {
            return false;
        }

        Optional<?> other = (Optional<?>) obj;
        return Objects.equals(value, other.value);
    }
    */


    // Avoid
    public void equalsAvoid(Object obj) {

        Optional<String> actualItem = Optional.of("Shoes");
        Optional<String> expectedItem = Optional.of("Shoes");

//        assertEquals(expectedItem.get(), actualItem.get());

        // get()

        expectedItem.get().equals(actualItem.get());

    }

    // Prefer
    public void equalsPrefer(Object obj) {

        Optional<String> actualItem = Optional.of("Shoes");
        Optional<String> expectedItem = Optional.of("Shoes");

//        assertEquals(expectedItem, actualItem);

        // equals 그냥

        actualItem.equals(expectedItem);

    }

}
