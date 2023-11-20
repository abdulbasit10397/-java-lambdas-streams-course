package section3;

import java.util.List;

public class CalculateListSumInStructuredWay {
    public static void main (String[] args) {
        int sum = calculateSum(List.of(12, 23, 56, 43, 54, 23, 76, 87));
        System.out.println(sum);
    }

    private static int calculateSum(List<Integer> integers) {
        int sum = 0;
        for (int number: integers) {
            sum+=number;
        }

        return sum;
    }
}
