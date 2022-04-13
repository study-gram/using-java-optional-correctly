package kr.springboot.examples.ex17;

import kr.springboot.examples.commons.Cart;
import kr.springboot.examples.commons.Product;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

/**
 * Do Not Use Optional to Return Empty Collections or Arrays
 * Optional을 사용하여 빈 컬렉션이나 배열을 반환하지 말것
 */
public class App {

    /**
     * Favor returning an empty collection/array.
     * With this in mind, rely on  Collections.emptyList(), emptyMap(), and emptySet().
     * In order to keep the code clean and lightweight avoid returningOptionalfornullor empty collections/arrays.
     * Prefer returning an empty array or collection.
     * 리턴값 Optional 금지, 없으면 차라리 빈 값을 넣어라.
     */


    // Avoid
    public Optional<List<Product>> fetchCartItemsAvoid(Long id) {

        Cart cart = new Cart();
        List<Product> items = cart.getItems();
        return Optional.ofNullable(items);

    }

    // Prefer
    public List<Product> fetchCartItemsPrefer(Long id) {

        Cart cart = new Cart();
        List<Product> items = cart.getItems();

        return items == null ? items : Collections.emptyList();

    }

}
