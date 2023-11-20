package section6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreamsUsingBuiltinMethods {
    public static void main(String[] args) {
        System.out.println("******************** Creating Stream Using StreamOf Method ************************");
        creatingStreamUsingStreamOf();
        System.out.println();

        System.out.println("******************** Creating Stream from List ************************");
        creatingStreamFromList();
        System.out.println();

        System.out.println("******************** Creating Stream from Array ************************");
        creatingStreamArray();
        System.out.println();
    }

    public static void creatingStreamArray() {
        int[] numbers = {12, 23, 56, 43, 87, 54, 23, 76};
        IntStream numbersStream = Arrays.stream(numbers);
        numbersStream.forEach(System.out::println);
    }

    public static void creatingStreamFromList() {
        List<Integer> numbers = List.of(12, 23, 56, 43, 87, 54, 23, 76);
        Stream<Integer> numbersStream = numbers.stream();
        numbersStream.forEach(System.out::println);
    }

    public static void creatingStreamUsingStreamOf() {
        Stream<Integer> stream = Stream.of(12, 23, 56, 43, 87, 54, 23, 76);
        stream.forEach(System.out::println);
    }
}
