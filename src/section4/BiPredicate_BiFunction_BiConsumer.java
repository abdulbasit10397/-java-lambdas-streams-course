package section4;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiPredicate_BiFunction_BiConsumer {
    public static void main(String[] args) {
        biPredicateExample();
        System.out.println();

        biFunctionExample();
        System.out.println();

        biConsumerExample();
    }

    private static void biPredicateExample() {
        System.out.println("********* Bi Predicate Example ****************");
        BiPredicate<Integer, Integer> biPredicate = (x, y) -> x > y;
        System.out.println(biPredicate.test(4, 8));
    }

    private static void biFunctionExample() {
        System.out.println("********* Bi Function Example ****************");
        BiFunction<Integer, Integer, String> biFunction = (n1, n2) -> n1 > n2 ? "n1 is greater" : "n2 is greater";
        System.out.println(biFunction.apply(4, 8));
    }

    private static void biConsumerExample() {
        System.out.println("********* Bi Consumer Example ****************");
        BiConsumer<Integer, Integer> biConsumer =
                (n1, n2) -> System.out.println("Square of n1 is: " + n1 * n1 + " & Square of n2 is: " + n2 * n2);
        biConsumer.accept(4, 5);
    }
}
