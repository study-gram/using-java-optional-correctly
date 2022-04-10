# using-java-optional-correctly

### 자바 옵셔널 제대로 사용하기

#### 참고

[26 Reasons Why Using Optional Correctly Is Not Optional](https://dzone.com/articles/using-optional-correctly-is-not-optional)

[Java Optional 바르게 쓰기](https://homoefficio.github.io/2019/10/03/Java-Optional-%EB%B0%94%EB%A5%B4%EA%B2%8C-%EC%93%B0%EA%B8%B0/)

#### 학습 목록

1. [변수에 Null 할당 금지](/src/kr/springboot/examples/ex1/App.java)
2. [Optional.get() 호출 전 Optional 값 확인 하기](/src/kr/springboot/examples/ex2/App.java)
3. [값이 없을 때 Optional.orElse() 메서드를 통해 이미 귀성된 기본 객체를 설정 또는 반환 해라](/src/kr/springboot/examples/ex3/App.java)
4. [값이 없을 때 Optional.orElseGet() 메서드를 통해 존재하지 않는 기본 개체를 설정또는 반환해라](/src/kr/springboot/examples/ex4/App.java)
5. [값이 없으면 orElseThrow()를 통해 java.util.NoSuchElementException 예외를 던져라 / Java 10 이상](/src/kr/springboot/examples/ex5/App.java)
6. [값이 없으면 orElseThrow(Supplier<? extends X> exceptionSupplier)를 통해 명시적 예외를 던져라.](/src/kr/springboot/examples/ex6/App.java)
7. [--- 선택 항목이 있고 Null 참조가 필요한 경우 orElse(null)를 사용해라 ( 보류 ) ---](/src/kr/springboot/examples/ex7/App.java)
8. [Optional이 있으면 사용하고 존재하지 않으면 아무것도 하지 마라. 이건 Optional.ifPresent()를 위한 것이다.](/src/kr/springboot/examples/ex8/App.java)
9. [Optional이 있으면 사용하고 존재하지 않으면 Empty 기반 작업을 해라. 이것은 Optional.ifPresentElse() / Java 9 이상](/src/kr/springboot/examples/ex9/App.java)
10. [값이 있을 때 해당 값을 선택적으로 설정또는 반환하고 값이 없는 경우 기타 옵션을 설정또는 반환해라. 이것은 Optional.or() 을 위한 작업임. / Java 9 이상.](/src/kr/springboot/examples/ex10/App.java)
11. Optional.orElse/orElseXXX는 람다에서 isPresent()-get() 쌍을 완벽하게 대체한다.
    1. [Example 1](/src/kr/springboot/examples/ex11/App1.java)
    2. [Example 2](/src/kr/springboot/examples/ex11/App2.java)
12. [값을 얻는 단일 목적으로 옵셔널의 메서드를 연결하지 말것](/src/kr/springboot/examples/ex12/App.java)
13. [필드 유형을 선택 사항으로 선언하지 말것](/src/kr/springboot/examples/ex13/App.java)
14. [생성자 인수에서 옵셔널을 사용하지 말것](/src/kr/springboot/examples/ex14/App.java)
15. [Setter 에서 옵셔널을 사용하지 마라](/src/kr/springboot/examples/ex15/App.java)
16. [메서드 인수에서 옵셔널을 사용하지 마라](/src/kr/springboot/examples/ex16/App.java)