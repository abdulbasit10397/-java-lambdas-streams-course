package section1;

import java.util.List;

public class IteratingListUsingFunctionalApproach {
    public static void main (String[] args) {
        printAllNumbersInListFunctional(List.of(12, 23, 56, 43, 54, 23, 76, 87));
        System.out.println("\n********************************");
        printAllNumbersInListFunctionalImproved(List.of(12, 23, 56, 43, 54, 23, 76, 87));
    }


    /** Method 01 */
    private static void printAllNumbersInListFunctional(List<Integer> integers) {
        integers.stream().forEach(IteratingListUsingFunctionalApproach::print); // Method Reference
    }
    public static void print(int n) {
        System.out.print(n + " ");
    }


    /** Method 02 */
    private static void printAllNumbersInListFunctionalImproved(List<Integer> integers) {
        integers.stream().forEach(System.out::println); // Method Reference
    }

    /** Method 03 */
    private static void printAllNumbersInListFunctionalUsingLambda(List<Integer> integers) {
        integers.stream().forEach(e -> System.out.print(e + " "));
    }
}
