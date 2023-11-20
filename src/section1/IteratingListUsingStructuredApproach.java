package section1;

import java.util.List;

public class IteratingListUsingStructuredApproach {
    public static void main (String[] args) {
        printAllNumbersInListStructured(List.of(12, 23, 56, 43, 54, 23, 76, 87));
    }

    private static void printAllNumbersInListStructured(List<Integer> integers) {
        for (int number: integers) {
            System.out.print(number + " ");
        }
    }
}
