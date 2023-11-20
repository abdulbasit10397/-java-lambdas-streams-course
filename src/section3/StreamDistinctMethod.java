package section3;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDistinctMethod {
    public static void main(String[] args) {
        printDistinctNumbers(List.of(12, 23, 56, 43, 87, 54, 23, 76));

        List<Integer> distinctNumbers = getDistinctNumbers(List.of(12, 23, 56, 43, 87, 54, 23, 76));
        System.out.println("\n\n" + distinctNumbers + "\n\n");
    }


    /**
     * Just Printing Distinct Numbers
     */
    private static void printDistinctNumbers(List<Integer> integers) {
        integers.stream()
                .distinct()
                .forEach(System.out::println);
    }


    /**
     * Returning List with Distinct Numbers
     */
    private static List<Integer> getDistinctNumbers(List<Integer> integers) {
        return integers.stream()
                .distinct().collect(Collectors.toList());
    }
}
