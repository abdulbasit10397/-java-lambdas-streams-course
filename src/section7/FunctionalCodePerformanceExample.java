package section7;

import section5.Course;

import java.util.List;

public class FunctionalCodePerformanceExample {
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

        System.out.println("************* Filtering Courses ********************");
        findFirstCourseWithCriteria(coursesList);
        System.out.println();

    }

    /** When following code runs, JDK doesn't iterate all list, except
     * it only iterate few elements. This shows that functional code is
     * very optimized */
    private static void findFirstCourseWithCriteria(List<Course> courses) {
        courses.stream().peek(System.out::println)
                .filter(course -> course.getName().length() > 11)
                .map(course -> course.getName().toUpperCase()).peek(System.out::println)
                .findFirst();
    }
}
