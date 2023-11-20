package section4;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Supplier_UnaryOperator_FuncInterfaces {
    public static void main (String[] args) {
        unaryOperatorExample();
        binaryOperatorExample();
        supplierExample();


    }

    private static void unaryOperatorExample() {
        System.out.println("********* Unary Operator Example ****************");
        UnaryOperator<Integer> unaryOperator = x -> 3*x;
        System.out.println(unaryOperator.apply(4));
    }

    private static void binaryOperatorExample() {
        System.out.println("********* Binary Operator Example ****************");
        BinaryOperator<Integer> binaryOperator = (x,y) -> x + y;
        System.out.println(binaryOperator.apply(4, 4));
    }

    private static void supplierExample() {
        System.out.println("********* Supplier Example ****************");
        Supplier<String> randomNumSupplier = () -> "Random Number: " + Math.random();
        System.out.println(randomNumSupplier.get());
    }
}
