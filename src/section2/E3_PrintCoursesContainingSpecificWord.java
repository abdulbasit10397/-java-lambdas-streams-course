package section2;

import java.util.List;

public class E3_PrintCoursesContainingSpecificWord {
    public static void main(String[] args) {
        printCoursesContainingSpecificWord(
                List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"),
                "Spring");
    }

    private static void printCoursesContainingSpecificWord(List<String> courses, String word) {
        courses.stream()
                .filter(course -> course.contains(word))
                .forEach(System.out::println);
    }
}
