package section3;

import java.util.Comparator;
import java.util.List;

public class StreamSortingUsingComparators_2 {
    public static void main(String[] args) {
        System.out.println("********************** Length-Wise Sorting Using BuiltIn Comparator ************************");
        printSortedCoursesUsingBuiltInComparator(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"));

        System.out.println("\n\n********************** Length-Wise Reverse Sorting Using Custom Comparator ************************");
        printSortedCoursesUsingCustomComparator( List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"));
    }

    /** Custom Comparator*/
    private static void printSortedCoursesUsingCustomComparator(List<String> courses) {
        courses.stream()
                .sorted((o1, o2) -> {
                    if(o1.length() == o2.length()) return 0;
                    if(o1.length() < o2.length()) return 1;
                    else return -1;
                })
                .forEach(System.out::println);
    }


    /** Built-In Comparator*/
    private static void printSortedCoursesUsingBuiltInComparator(List<String> courses) {
        courses.stream()
                .sorted(Comparator.comparing(str -> str.length()))
                .forEach(System.out::println);
    }
}
