package section3;

import java.util.List;

public class CalculateMaxInList {
    public static void main(String[] args) {
        System.out.println("********** Maximum Value ************");
        int max = calculateMax(List.of(12, 23, 56, 43, 87, 54, 23, 76));
        System.out.println(max);

    }

    private static int calculateMax(List<Integer> integers) {
        return integers.stream().reduce(0, (x, y) -> x > y ? x : y);
    }
}
