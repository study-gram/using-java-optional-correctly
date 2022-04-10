package kr.springboot.examples.ex16;

import kr.springboot.examples.commons.Cart;
import kr.springboot.examples.commons.CoolRenderer;
import kr.springboot.examples.commons.Renderer;

import java.util.Objects;
import java.util.Optional;

/**
 * Do Not Use Optional in Methods Arguments
 * 메서드 인수에서 옵셔널을 사용하지 마세욧
 */
public class App {

    public static void main(String[] args) {

        App app1 = new App();
        Cart cart = new Cart();

        // Avoid
        app1.renderCustomerAvoid(cart, Optional.<Renderer>of(CoolRenderer::new), Optional.empty());

        // Prefer 1
        app1.renderCustomerPrefer1(cart, new CoolRenderer(), null);

        // Prefer 2
        app1.renderCustomerPrefer2(cart, new CoolRenderer(), null);

    }

    // Avoid
    public void renderCustomerAvoid(Cart cart, Optional<Renderer> renderer, Optional<String> name) {

        if (cart == null)
            throw new IllegalArgumentException("Cart cannot be null");

        Renderer customRenderer = renderer.orElseThrow(
                () -> new IllegalArgumentException("Renderer cannot be null")
        );

        String customerName = name.orElseGet(() -> "anonymous");

    }

    // Prefer 1
    public void renderCustomerPrefer1(Cart cart, Renderer renderer, String name) {

        if (cart == null)
            throw new IllegalArgumentException("Cart cannot be null");

        if (renderer == null)
            throw new IllegalArgumentException("Renderer cannot be null");

        String customerName = Objects.requireNonNullElseGet(name, () -> "anonymous");

    }

    // Prefer 2 (rely onNullPointerException)
    public void renderCustomerPrefer2(Cart cart, Renderer renderer, String name) {

        Objects.requireNonNull(cart, "Cart cannot be null");
        Objects.requireNonNull(renderer, "Renderer cannot be null");

        String customerName = Objects.requireNonNullElseGet(name, () -> "anonymous");

    }

    // Prefer 3 (avoidNullPointerExceptionand useIllegalArgumentExceptionor other exception)
    // 나중에..

}
