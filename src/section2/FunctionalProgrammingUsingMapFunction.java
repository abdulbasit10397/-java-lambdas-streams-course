package section2;

import java.util.List;

public class FunctionalProgrammingUsingMapFunction {
    public static void main(String[] args) {
        System.out.println("\n************** Squares of All numbers ******************");
        printSquareOfNumbers(List.of(12, 23, 56, 43, 54, 23, 76, 87));

        System.out.println("\n*************** Squares of Even numbers *****************");
        printSquareOfEvenNumbers(List.of(12, 23, 56, 43, 54, 23, 76, 87));
    }

    private static void printSquareOfNumbers(List<Integer> integers) {
        integers.stream()
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    private static void printSquareOfEvenNumbers(List<Integer> integers) {
        integers.stream()
                .filter(number-> number % 2 == 0)
                .map(number -> number * number)
                .forEach(System.out::println);
    }
}
