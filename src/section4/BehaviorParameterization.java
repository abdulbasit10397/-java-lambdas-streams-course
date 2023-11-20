package section4;

import java.util.List;
import java.util.function.Predicate;

public class BehaviorParameterization {
    public static void main (String[] args) {
        List<Integer> numbers = List.of(12, 23, 56, 43, 87, 54, 23, 76);
        System.out.println("******************** Even Only ************************");
        filterAndPrint(numbers, x-> x % 2==0);

        System.out.println();
        System.out.println("******************** Odd Only ************************");
        filterAndPrint(numbers, x-> x % 2!=0);
    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> predicate) {
        numbers.stream()
                .filter(predicate)
                .forEach(System.out::println);
    }
}
