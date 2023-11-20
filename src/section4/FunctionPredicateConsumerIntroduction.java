package section4;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionPredicateConsumerIntroduction {
    public static void main (String[] args) {
        printSquareOfEvenNums(List.of(12, 23, 56, 43, 87, 54, 23, 76));
    }

    private static void printSquareOfEvenNums(List<Integer> integers) {
        /** isEvenPredicate2() is an alternative (legacy descriptive) way */
        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;

        /** squareFunction2() is an alternative (legacy descriptive) way */
        Function<Integer, Integer> squareFunction = x -> x * x;

        /** numConsumer2() is an alternative (legacy descriptive) way */
        Consumer<Integer> numConsumer = System.out::println;

        integers.stream()
                .filter(isEvenPredicate)
                .map(squareFunction)
                .forEach(numConsumer);
    }

    private static Consumer<Integer> numConsumer2 () {
        return new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
    }

    private static Function<Integer, Integer> squareFunction2 () {
        return new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer * integer;
            }
        };
    }

    private static Predicate<Integer> isEvenPredicate2() {
        return new Predicate<Integer>() {
            @Override
            public boolean test(Integer number) {
                return number % 2 == 0;
            }
        };
    }
}
