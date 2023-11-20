package section3;

import java.util.List;

public class E8_CubeEveryNumAndFindSum {
    public static void main(String[] args) {
        int cubeSum = cubeEveryNumAndReturnSquareSum(List.of(12, 23, 56, 43, 87, 54, 23, 76));
        System.out.println("********** Sum of All Cube Values - Lambda ************");
        System.out.println(cubeSum + "\n\n");
    }

    private static int cubeEveryNumAndReturnSquareSum(List<Integer> integers) {
        return integers.stream()
                .map(n-> {
                    n= n * n * n;
                    System.out.println(n);
                    return n;
                })
                .reduce(0, Integer::sum);
    }

}
