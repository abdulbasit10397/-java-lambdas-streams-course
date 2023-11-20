package section7;

import section5.Course;

import java.util.List;
import java.util.function.Predicate;

public class CreatingHigherOrderFunctions {
    public static void main(String[] args) {
        List<Course> coursesList = List.of(
                new Course("Spring", "Framework", 98, 20000),
                new Course("Spring Boot", "Framework", 95, 18000),
                new Course("API", "Microservices", 96, 22000),
                new Course("Microservices", "Microservices", 97, 25000),
                new Course("Fullstack", "Fullstack", 91, 14000),
                new Course("AWS", "Cloud", 92, 21000),
                new Course("Azure", "Cloud", 99, 21000),
                new Course("Docker", "Cloud", 92, 20000),
                new Course("Kubernetes", "Cloud", 91, 20000)
        );

        System.out.println("************* Getting Predicate with Score Above 95 ********************");
        Predicate<Course> predicate = getPredicate(95);
        System.out.println(predicate);

    }


    private static Predicate<Course> getPredicate(int reviewScore) {
        return course -> course.getReviewScore() > reviewScore;
    }
}
