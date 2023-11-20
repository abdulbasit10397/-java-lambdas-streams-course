package section3;

import java.util.List;

public class E9_FindSumOfOddNums {
    public static void main(String[] args) {
        int sumOfOddNums = sumOfOddNumbers(List.of(12, 23, 56, 43, 87, 54, 23, 76));
        System.out.println("********** Sum of Odd Numbers in List - Lambda ************");
        System.out.println(sumOfOddNums + "\n\n");
    }

    private static int sumOfOddNumbers(List<Integer> integers) {
        return integers.stream()
                .filter(n -> n % 2 != 0)
                .reduce(0, Integer::sum);
    }

}
