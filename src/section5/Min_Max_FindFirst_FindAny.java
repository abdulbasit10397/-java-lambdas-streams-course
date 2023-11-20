package section5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Min_Max_FindFirst_FindAny {
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

        System.out.println("************* Course with Maximum Students ********************");
        courseWithMaxStudents(coursesList);
        System.out.println();

        System.out.println("************* Course with Minimum Students ********************");
        courseWithMinStudents(coursesList);
        System.out.println();

        System.out.println("************* First Course with 21000 Students ********************");
        firstCourseHaving21KStudents(coursesList);
        System.out.println();
    }

    private static void courseWithMaxStudents(List<Course> coursesList) {
        Course filteredCourse = coursesList.stream()
                        .max(Comparator.comparing(Course::getNoOfStudents)).get();
        System.out.println(filteredCourse);
    }

    private static void courseWithMinStudents(List<Course> coursesList) {
        Course filteredCourse = coursesList.stream()
                .min(Comparator.comparing(Course::getNoOfStudents)).get();
        System.out.println(filteredCourse);
    }

    private static void firstCourseHaving21KStudents(List<Course> coursesList) {
        Course filteredCourse = coursesList.stream()
                .filter(x -> x.getNoOfStudents()==21000)
                .findFirst()
                /** if criteria is not met, then it will return default*/
                .orElse(new Course("Default", "Default", 0, 0));
        System.out.println(filteredCourse);
    }

}
