package kr.springboot.examples.ex13;

/**
 * Do Not Declare Any Field of Type Optional
 * 필드 유형을 선택 사항으로 선언하지 마랏
 */
public class App {

    /**
     * // AVOID
     * public class Customer {
     *
     *     [access_modifier] [static] [final] Optional<String> zip;
     *     [access_modifier] [static] [final] Optional<String> zip = Optional.empty();
     *     ...
     * }
     */

    /**
     * // PREFER
     * public class Customer {
     *
     *     [access_modifier] [static] [final] String zip;
     *     [access_modifier] [static] [final] String zip = "";
     *     ...
     * }
     */

}
