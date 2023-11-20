package section5;

import java.util.Comparator;
import java.util.List;

public class Sum_Average_Count {
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

        System.out.println("************* All Students - Sum Example ********************");
        allStudents(coursesList);
        System.out.println();

        System.out.println("************* Courses Count Example ********************");
        courseWithStudentsHavingScoreAbove95(coursesList);
        System.out.println();

        System.out.println("************* Courses Average Example ********************");
        averageReviewScoreOfAllCourses(coursesList);
        System.out.println();
    }

    private static void averageReviewScoreOfAllCourses(List<Course> coursesList) {
        double average = coursesList.stream().mapToInt(Course::getReviewScore).average().getAsDouble();
        System.out.println(average);
    }

    private static void allStudents(List<Course> coursesList) {
        int sum = coursesList.stream().mapToInt(Course::getNoOfStudents).sum();
        System.out.println(sum);
    }

    private static void courseWithStudentsHavingScoreAbove95(List<Course> coursesList) {
        long count = coursesList.stream()
                .filter(x -> x.getReviewScore() >= 95)
                .mapToInt(Course::getReviewScore)
                .count();
        System.out.println(count);
    }


}
