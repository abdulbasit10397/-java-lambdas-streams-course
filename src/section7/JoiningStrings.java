package section7;

import java.util.List;
import java.util.stream.Collectors;

public class JoiningStrings {
    public static void main(String[] args) {
        System.out.println("******************** Joining Strings Using Comma ************************");
        combineStrings();
        System.out.println();
    }

    public static void combineStrings () {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        String response = courses.stream().collect(Collectors.joining(", "));
        System.out.println(response);
    }

}
