package section3;

import java.util.Comparator;
import java.util.List;

public class StreamSortingUsingComparators_1 {
    public static void main(String[] args) {
        System.out.println("********************** Reverse Sorting Using BuiltIn Comparator ************************");
        printSortedNumbersUsingBuiltInComparator(List.of(12, 23, 56, 43, 87, 54, 23, 76));

        System.out.println("\n\n********************** Reverse Sorting Using Custom Comparator ************************");
        printSortedNumbersUsingCustomComparator(List.of(12, 23, 56, 43, 87, 54, 23, 76));
    }

    /** Custom Comparator*/
    private static void printSortedNumbersUsingCustomComparator(List<Integer> integers) {
        integers.stream()
                .sorted((o1, o2) -> {
                    if(o1 == o2) return 0;
                    if(o1 < o2) return 1;
                    else return -1;
                })
                .forEach(System.out::println);
    }


    /** Built-In Comparator*/
    private static void printSortedNumbersUsingBuiltInComparator(List<Integer> integers) {
        integers.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}
