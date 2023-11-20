package section3;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsCollectingElements {
    public static void main(String[] args) {
        System.out.println("\n\n********************** Collecting Square of Elements in New List ************************");
        List<Integer> squaredList = getSquareOfListItems(List.of(12, 23, 56, 43, 87, 54, 23, 76));
        System.out.println(squaredList);
    }

    /** Custom Comparator*/
    private static List<Integer> getSquareOfListItems(List<Integer> integers) {
        return integers.stream()
                .map(item -> item * item)
                .collect(Collectors.toList());
    }

}
