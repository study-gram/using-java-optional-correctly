package kr.springboot.examples.ex20;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

/**
 * Avoid Optional <T> and Choose Non-Generic OptionalInt, OptionalLong, or OptionalDouble
 * 선택적 <T>를 피하고 일반이 아닌 OptionalInt, OptionalLong 또는 OptionalDouble을 선택하자
 */
public class App {

    /**
     * Avoid example은 Boxing 과 Unboxing의 문제로 성능을 저하시키고 값비싼 작업임.
     * 좋은 예와 안좋은 예를 보자
     */

    // Avoid
    public void avoidExample() {
        Optional<Integer> priceInteger = Optional.of(50);
        Optional<Long> priceLong = Optional.of(50L);
        Optional<Double> priceDouble = Optional.of(50.43d);
    }

    //Prefer
    public void preferExample() {
        OptionalInt priceInt = OptionalInt.of(50);
        OptionalLong priceLong = OptionalLong.of(50L);
        OptionalDouble priceDouble = OptionalDouble.of(50.43d);

        // 사용법
        priceInt.getAsInt();
        priceLong.getAsLong();
        priceDouble.getAsDouble();

    }

}
