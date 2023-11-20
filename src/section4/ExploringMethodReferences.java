package section4;

import java.util.List;
import java.util.function.Supplier;

public class ExploringMethodReferences {
    public static void main (String[] args) {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        Supplier<String> constructorMethodReference = String::new; /** Calling method reference for constructor */

        courses.stream()
                .map(String::toUpperCase) /** Calling method reference on Object*/
                .forEach(ExploringMethodReferences::printStr); /** Calling static custom method reference*/
    }

    private static void printStr(String str) {
        System.out.println(str);
    }
}
