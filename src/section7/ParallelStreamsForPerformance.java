package section7;

import java.util.stream.LongStream;

public class ParallelStreamsForPerformance {
    public static void main (String[] args) {
        System.out.println("************** Calculating Long Sum - Non-Parallel Streams **************");
        longSumUsingStreams();
        System.out.println();

        System.out.println("************** Calculating Long Sum - Parallel Streams **************");
        longSumUsingParallelStreams();
        System.out.println();
    }

    private static void longSumUsingParallelStreams() {
        long start = System.currentTimeMillis();
        System.out.println(LongStream.rangeClosed(0, 1000000000).parallel().sum());
        System.out.print(System.currentTimeMillis()-start);
    }

    public static void longSumUsingStreams () {
        long start = System.currentTimeMillis();
        System.out.println(LongStream.rangeClosed(0, 1000000000).sum());
        System.out.print(System.currentTimeMillis()-start);
    }
}
