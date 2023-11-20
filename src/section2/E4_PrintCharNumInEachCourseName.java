package section2;

import java.util.List;

public class E4_PrintCharNumInEachCourseName {
    public static void main(String[] args) {
        printNumberOfCharactersInEachCourseName(
                List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"),
                4);
    }


    private static void printNumberOfCharactersInEachCourseName(List<String> courses, int courseNameLength) {
        courses.stream()
                .map(e -> e + " " + e.length())
                .forEach(System.out::println);
    }
}
