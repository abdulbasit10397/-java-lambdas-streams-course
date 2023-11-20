package section3;

import java.util.List;

public class CalculateListSumInFunctionalWay {
    public static void main(String[] args) {
        System.out.println("********** Sum 1 ************");
        int sum1 = calculateSumFunctional_01(List.of(12, 23, 56, 43, 54, 23, 76, 87));
        System.out.println(sum1);

        System.out.println("********** Sum 2 ************");
        int sum2 = calculateSumFunctional_02(List.of(12, 23, 56, 43, 54, 23, 76, 87));
        System.out.println(sum2);

        System.out.println("********** Sum 3 ************");
        int sum3 = calculateSumFunctional_03(List.of(12, 23, 56, 43, 54, 23, 76, 87));
        System.out.println(sum3);
    }

    /**
     * Method 01
     */
    private static int calculateSumFunctional_01(List<Integer> integers) {
        return integers.stream().reduce(0, CalculateListSumInFunctionalWay::sum);
    }
    private static int sum(int a, int b) {
        System.out.println("a: " + a + " --- b: " + b); //Printing value to see what's happening in reduce
        return a + b;
    }


    /**
     * Method 02
     */
    private static int calculateSumFunctional_02(List<Integer> integers) {
        return integers.stream().reduce(0, (a, b) -> a + b);
    }


    /**
     * Method 03
     */
    private static int calculateSumFunctional_03(List<Integer> integers) {
        return integers.stream()
                .mapToInt(value -> value.intValue()).sum();
    }
}
