package kr.springboot.examples.ex24;

import kr.springboot.examples.commons.Product;

import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

/**
 * Do We Need to Chain the Optional API With the Stream API?
 * 옵셔널 API랑 스트림 API의 연결이 필요할까?
 */
public class App {

    public Optional<Product> fetchProductById(String id) {
        Product product = new Product();
        return Optional.ofNullable(product);
    }

    // Avoid
    public List<Product> getProductListAvoid(List<String> productId) {

        return productId.stream()
                .map(this::fetchProductById)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(toList());
    }

    /**
     * Practically, Optional.stream() allows us to replace filter() and map() with flatMap().
     */
    // Prefer
    public List<Product> getProductListPrefer(List<String> productId) {
        return productId.stream()
                .map(this::fetchProductById)
                .flatMap(Optional::stream)
                .collect(toList());
    }

    /**
     * Also, we can convertOptionalto List:
     */
    public <T> List<T> convertOptionalToList(Optional<T> optional) {
        return optional.stream().collect(toList());
    }


}