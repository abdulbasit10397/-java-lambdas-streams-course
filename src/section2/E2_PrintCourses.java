package section2;

import java.util.List;

public class E2_PrintCourses {
    public static void main(String[] args) {
        printCourses(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"));
    }

    private static void printCourses(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }
}
