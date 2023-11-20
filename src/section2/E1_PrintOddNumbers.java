package section2;

import java.util.List;

public class E1_PrintOddNumbers {
    public static void main(String[] args) {
        printOddNumbersInListFunctionalUsingLambda(List.of(12, 23, 56, 43, 54, 23, 76, 87));
    }

    private static void printOddNumbersInListFunctionalUsingLambda(List<Integer> integers) {
        integers.stream()
                .filter(e -> e % 2 != 0) //Lambda is nothing but a method with no name and no return type
                .forEach(System.out::println); // Method Reference
    }

}
