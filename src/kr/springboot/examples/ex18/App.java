package kr.springboot.examples.ex18;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Avoid Using Optional in Collections
 * 컬렉션에서 옵셔널을 사용하지 말것
 */
public class App {

    // Avoid
    public void avoidExample() {
        Map<String, Optional<String>> items = new HashMap<>();
        items.put("ITEM1", Optional.ofNullable(""));
        items.put("ITEM2", Optional.ofNullable(""));

        Optional<String> item = items.get("ITEM1");

        if (item == null) {
            System.out.println("이키로는 찾을 수 없다구");
        } else {
            String unwrappedItem = item.orElse("없어!!!!");
            System.out.println("찾았다 : " + unwrappedItem);
        }
    }

    // Prefer
    public void preferExample() {

        Map<String, String> items = new HashMap<>();
        items.put("ITEM1", "Shoes");
        items.put("ITEM2", null);

        // 아이템 얻기
        String item1 = get(items, "I1");  // Shoes
        String item2 = get(items, "I2");  // null
        String item3 = get(items, "I3");  // NOT FOUND

    }

    private String get(Map<String, String> map, String key) {
        return map.getOrDefault(key, "찾았땅");
    }

    /**
     * 그 외 다른 방법
     * 1. containsKey() method
     * 2. Trivial implementation by extending HashMap
     * 3. Java 8computeIfAbsent() method
     * 4. Apache Commons DefaultedMap
     */

}
