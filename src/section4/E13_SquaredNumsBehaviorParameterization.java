package section4;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class E13_SquaredNumsBehaviorParameterization {
    public static void main (String[] args) {
        List<Integer> numbers = List.of(12, 23, 56, 43, 87, 54, 23, 76);
        System.out.println("******************** Square of List Elements ************************");
        List<Integer> squaredNumbers = getSquaredNumbersList(numbers, x-> x*x);
        System.out.println(squaredNumbers);
    }

    private static List<Integer> getSquaredNumbersList(List<Integer> numbers, Function<Integer, Integer> squareFunction) {
        return numbers.stream()
                .map(squareFunction)
                .collect(Collectors.toList());
    }
}
