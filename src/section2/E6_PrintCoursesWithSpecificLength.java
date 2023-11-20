package section2;

import java.util.List;

public class E6_PrintCoursesWithSpecificLength {
    public static void main(String[] args) {
        printCoursesContainingSpecificWord(
                List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"),
                4);
    }

    private static void printCoursesContainingSpecificWord(List<String> courses, int courseNameLength) {
        courses.stream()
                .filter(course -> course.length()>=4)
                .forEach(System.out::println);
    }
}
