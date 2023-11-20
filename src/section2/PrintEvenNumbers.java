package section2;

import java.util.List;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        System.out.println("***************** Structural ******************");
        printEvenNumbersInListStructured(List.of(12, 23, 56, 43, 54, 23, 76, 87));
        System.out.println("****************** Functional *****************");
        printEvenNumbersInListFunctional(List.of(12, 23, 56, 43, 54, 23, 76, 87));
        System.out.println("******************* Functional Using Lambda ****************");
        printEvenNumbersInListFunctionalUsingLambda(List.of(12, 23, 56, 43, 54, 23, 76, 87));
    }

    private static void printEvenNumbersInListStructured(List<Integer> integers) {
        for (int number : integers) {
            if (number % 2 == 0)
                System.out.println(number);
        }
    }


    /**
     * Functional Method 1
     */
    private static void printEvenNumbersInListFunctional(List<Integer> integers) {
        integers.stream()
                .filter(PrintEvenNumbers::isEven)
                .forEach(System.out::println); // Method Reference
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }


    /**
     * Functional Method 2
     */
    private static void printEvenNumbersInListFunctionalUsingLambda(List<Integer> integers) {
        integers.stream()
                .filter(e -> e % 2 == 0) //Lambda is nothing but a method with no name and no return type
                .forEach(System.out::println); // Method Reference
    }
}
