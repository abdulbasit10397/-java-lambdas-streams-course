package section7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExamples {
    public static void main(String[] args) {
        System.out.println("******************** Splitting All Characters Of A Course ************************");
        splitAllCharactersOfCourseStrings();
        System.out.println();

        System.out.println("******************** Splitting All Distinct Characters Of A Course ************************");
        splitAllDistinctCharactersOfCourseStrings();
        System.out.println();

        System.out.println("******************** Creating Tuples of Courses ************************");
        coursesTuples();
        System.out.println();

        System.out.println("******************** Creating Tuples of Courses Having Same Char Length ************************");
        sameLengthCoursesTuples();
        System.out.println();
    }

    private static void sameLengthCoursesTuples() {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        List<List<String>> response = courses.stream()
                .flatMap(course -> courses.stream()
                        .filter(course2-> course2.length()== course.length())
                        .map(course2 -> List.of(course, course2)))
                .filter(list -> !list.get(0).equals(list.get(1)))
                .collect(Collectors.toList());
        System.out.println(response);
    }

    private static void coursesTuples() {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        List<List<String>> response = courses.stream()
                .flatMap(course -> courses.stream().map(course2 -> List.of(course, course2)))
                .filter(list -> !list.get(0).equals(list.get(1)))
                .collect(Collectors.toList());
        System.out.println(response);
    }

    public static void splitAllDistinctCharactersOfCourseStrings() {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<String> response = courses.stream().map(c -> c.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());
        System.out.println(response);
    }

    public static void splitAllCharactersOfCourseStrings() {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        List<String> response = courses.stream().map(c -> c.split("")).flatMap(Arrays::stream).collect(Collectors.toList());
        System.out.println(response);
    }
}
