package section2;

import java.util.List;

public class E5_PrintOddNumbersCubes {
    public static void main(String[] args) {
        printOddNumbersInListFunctionalUsingLambda(List.of(12, 23, 56, 43, 54, 23, 76, 87));
    }

    private static void printOddNumbersInListFunctionalUsingLambda(List<Integer> integers) {
        integers.stream()
                .filter(e -> e % 2 != 0)
                .map(e -> e * e * e)
                .forEach(System.out::println);
    }

}
