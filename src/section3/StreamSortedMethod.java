package section3;

import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedMethod {
    public static void main(String[] args) {
        printSortedNumbers(List.of(12, 23, 56, 43, 87, 54, 23, 76));

        List<Integer> sortedNumbers = getSortedNumbers(List.of(12, 23, 56, 43, 87, 54, 23, 76));
        System.out.println("\n\n" + sortedNumbers + "\n\n");
    }


    /**
     * Just Printing Distinct Numbers
     */
    private static void printSortedNumbers(List<Integer> integers) {
        integers.stream()
                .sorted() //Sorts in ascending order
                .forEach(System.out::println);
    }


    /**
     * Returning List with Distinct Numbers
     */
    private static List<Integer> getSortedNumbers(List<Integer> integers) {
        return integers.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}
