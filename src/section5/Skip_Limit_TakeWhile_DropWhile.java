package section5;

import java.util.List;
import java.util.stream.Collectors;

public class Skip_Limit_TakeWhile_DropWhile {
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

        System.out.println("************* Skip Example ********************");
        skipExample(coursesList);
        System.out.println();

        System.out.println("************* Limit Example ********************");
        limitExample(coursesList);
        System.out.println();

        System.out.println("************* Drop While Example ********************");
        dropWhileExample(coursesList);
        System.out.println();
    }

    /** I want to drop all items until one of the elements
     * meet the criteria, then I start collecting */
    private static void dropWhileExample(List<Course> coursesList) {
        List<Course> filteredCourses = coursesList.stream()
                .dropWhile(x -> x.getReviewScore() >= 95)
                .collect(Collectors.toList());
        System.out.println(filteredCourses);
    }


    /** I want to collect all items until one of the elements doesn't
     * meet the criteria, i can do using takeWhile*/
    private static void takeWhileExample(List<Course> coursesList) {
        List<Course> filteredCourses = coursesList.stream()
                .takeWhile(x -> x.getReviewScore() >= 95)
                .collect(Collectors.toList());
        System.out.println(filteredCourses);
    }

    private static void limitExample(List<Course> coursesList) {
        List<Course> filteredCourses = coursesList.stream()
                .limit(5) /** Will only collect first 5 courses. Same as sql limit */
                .collect(Collectors.toList());
        System.out.println(filteredCourses);
    }

    private static void skipExample(List<Course> coursesList) {
        List<Course> filteredCourses = coursesList.stream()
                .skip(3) /** Will skip first 3 courses. */
                .collect(Collectors.toList());
        System.out.println(filteredCourses);
    }
}
