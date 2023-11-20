package section6;

import java.math.BigInteger;
import java.util.stream.LongStream;

public class BigIntegerExample {
    public static void main(String[] args) {
        System.out.println("******************** Using Big Integer ************************");
        getAVeryBigIntegerValue();
        System.out.println();
    }

    public static void getAVeryBigIntegerValue() {
        BigInteger bigInteger = LongStream
                .rangeClosed(1, 50)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        System.out.println(bigInteger);
    }
}
