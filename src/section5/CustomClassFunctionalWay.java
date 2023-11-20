package section5;

import java.util.List;

public class CustomClassFunctionalWay {
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

        System.out.println("************* Printing Courses with Score Above 95 ********************");
        printCoursesWithReviewAbove95(coursesList);
        System.out.println();

        System.out.println("************* Checking if all courses have 90+ score *******************");
        System.out.println(checkIfAllCoursesHaveScoreAbove90(coursesList));
        System.out.println();

        System.out.println("************* Checking if none courses have 95+ score *******************");
        System.out.println(checkIfNoneCoursesHaveScoreAbove95(coursesList));
        System.out.println();

        System.out.println("************* Checking if any course(s) have 97 score *******************");
        System.out.println(checkIfAnyOfCoursesHaveScoreOf97(coursesList));
        System.out.println();
    }

    private static boolean checkIfAnyOfCoursesHaveScoreOf97 (List<Course> courses) {
        return courses.stream()
                .anyMatch(x -> x.getReviewScore() == 97);
    }

    private static boolean checkIfNoneCoursesHaveScoreAbove95 (List<Course> courses) {
        return courses.stream()
                .noneMatch(x -> x.getReviewScore() > 95);
    }

    private static boolean checkIfAllCoursesHaveScoreAbove90 (List<Course> courses) {
        return courses.stream()
                .allMatch(x -> x.getReviewScore() > 90);
    }


    private static void printCoursesWithReviewAbove95 (List<Course> courses) {
        courses.stream()
                .filter(x -> x.getReviewScore() > 95)
                .forEach(System.out::println);
    }
}
