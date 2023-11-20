package section6;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CreatingStreamsWithFirst100NumsSqs {
    public static void main (String[] args) {
        System.out.println("******************** Creating Stream of First 100 Integers ************************");
        createFirst100NumStream();
        System.out.println();

        System.out.println("******************** Iterating Stream ************************");
        iterate1To20By2();
        System.out.println();

        System.out.println("******************** Converting Primitive Stream Into a List ************************");
        convertIntStreamToList();
        System.out.println();
    }

    public static void convertIntStreamToList () {
        IntStream iteratorStream = IntStream.iterate(1, e-> e + 2).limit(10);
        List<Integer> numbersList = iteratorStream.boxed().collect(Collectors.toList());
        System.out.println(numbersList);
    }

    public static void createFirst100NumStream () {
        IntStream first100NumStream = IntStream.range(1, 100); /**100 will not be included*/
        /** IntStream first100NumStream = IntStream.rangeClosed(1, 100); 100 will be included */
        first100NumStream.forEach(System.out::println);
    }

    public static void iterate1To20By2 () {
        IntStream iteratorStream = IntStream.iterate(1, e-> e + 2).limit(10);
        iteratorStream.forEach(System.out::println);
    }
}
