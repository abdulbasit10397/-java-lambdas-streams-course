package section3;

import java.util.List;

public class E7_SquareEveryNumAndFindSum {
    public static void main(String[] args) {
        int squareSum = squareEveryNumAndReturnSquareSum(List.of(12, 23, 56, 43, 87, 54, 23, 76));
        System.out.println("********** Sum of All Square Values - Lambda ************");
        System.out.println(squareSum + "\n\n");

        int squareSum2 = squareEveryNumAndReturnSquareSum02(List.of(12, 23, 56, 43, 87, 54, 23, 76));
        System.out.println("********** Sum of All Square Values - Method Reference ************");
        System.out.println(squareSum2);

    }

    private static int squareEveryNumAndReturnSquareSum(List<Integer> integers) {
        return integers.stream()
                .map(n-> {
                    n= n * n;
                    System.out.println(n);
                    return n;
                })
                .reduce(0, (a, b) -> a + b);
    }


    private static int squareEveryNumAndReturnSquareSum02(List<Integer> integers) {
        return integers.stream()
                .map(E7_SquareEveryNumAndFindSum::square)
                .reduce(0, E7_SquareEveryNumAndFindSum::sum);
    }

    private static int square (int a) {
        int n = a * a;
        System.out.println(n);
        return n;
    }

    private static int sum (int a, int b) {
        return a + b;
    }
}
