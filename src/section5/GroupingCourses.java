package section5;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingCourses {
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

        System.out.println("************* Group Courses by Category ********************");
        groupCoursesByCategory(coursesList);
        System.out.println();

        System.out.println("************* Count Courses - Grouped By Category ********************");
        countGroupedByCategoryCourses(coursesList);
        System.out.println();

        System.out.println("************* Max Review Score Course -In Each Category ********************");
        courseWithMaxScoreInEachCategory(coursesList);
        System.out.println();

        System.out.println("************* Name, Category - Grouping ********************");
        groupByNameCategory(coursesList);
        System.out.println();
    }

    private static void groupByNameCategory(List<Course> coursesList) {
        Map<String, List<String>> groupedCourses = coursesList.stream()
                .collect(Collectors.groupingBy(Course::getCategory,
                        Collectors.mapping(Course::getName, Collectors.toList())));
        System.out.println(groupedCourses);
    }

    private static void courseWithMaxScoreInEachCategory(List<Course> coursesList) {
        Map<String, Optional<Course>> groupedCourses = coursesList.stream()
                .collect(Collectors.groupingBy(Course::getCategory,
                        Collectors.maxBy(Comparator.comparing(Course::getReviewScore))));
        System.out.println(groupedCourses);
    }

    private static void groupCoursesByCategory(List<Course> coursesList) {
        Map<String, List<Course>> groupedCourses = coursesList.stream()
                .collect(Collectors.groupingBy(Course::getCategory));
        System.out.println(groupedCourses);
    }

    private static void countGroupedByCategoryCourses(List<Course> coursesList) {
        Map<String, Long> groupedCourses = coursesList.stream()
                .collect(Collectors.groupingBy(Course::getCategory, Collectors.counting()));
        System.out.println(groupedCourses);
    }
}
