package section3;

import java.util.List;
import java.util.stream.Collectors;

public class E10_CreateAListHavingEvenNumbersOnly {
    public static void main(String[] args) {
        System.out.println("\n\n********************** Collecting Even Elements in New List ************************");
        List<Integer> evenList = getEvenListItems(List.of(12, 23, 56, 43, 87, 54, 23, 76));
        System.out.println(evenList);
    }

    /** Custom Comparator*/
    private static List<Integer> getEvenListItems(List<Integer> integers) {
        return integers.stream()
                .filter(e -> e % 2 == 0)
                .collect(Collectors.toList());
    }

}
