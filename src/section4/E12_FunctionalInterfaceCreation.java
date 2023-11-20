package section4;

import java.util.List;
import java.util.function.BinaryOperator;

public class E12_FunctionalInterfaceCreation {
    public static void main (String[] args) {
        int sum = getSumOfListItems(List.of(12, 23, 56, 43, 87, 54, 23, 76));
        System.out.println(sum);
    }

    private static int getSumOfListItems(List<Integer> integers) {
        return integers.stream()
                //.reduce(0, Integer::sum)      //Short Way
                .reduce(0, getDescriptiveBinaryOperation());  //Descriptive Way
    }

    private static BinaryOperator<Integer> getDescriptiveBinaryOperation() {
        return new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };
    }
}
