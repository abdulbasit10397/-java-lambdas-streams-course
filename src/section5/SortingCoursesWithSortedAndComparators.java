package section5;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingCoursesWithSortedAndComparators {
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

        System.out.println("************* Sorting Courses By No Of Students Ascending ********************");
        sortCoursesByNoOfStudentsAsc(coursesList);
        System.out.println();

        System.out.println("************* Sorting Courses By No Of Students Descending ********************");
        sortCoursesByNoOfStudentsDesc(coursesList);
        System.out.println();

        System.out.println("************* Sorting Courses By No Of Students And Review Score Descending ********************");
        sortCoursesByNoOfStudentsAndReviewScoreDesc(coursesList);
        System.out.println();

    }

    public static void sortCoursesByNoOfStudentsAndReviewScoreDesc (List<Course> courses) {
        Comparator<Course> comparingByNoOfStudentsAndScore = Comparator
                .comparing(Course::getNoOfStudents)
                .thenComparing(Course::getReviewScore)
                .reversed();


        List<Course> sortedList = courses.stream()
                .sorted(comparingByNoOfStudentsAndScore)
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }

    public static void sortCoursesByNoOfStudentsDesc (List<Course> courses) {
        Comparator<Course> comparingByNoOfStudents = Comparator.comparing(Course::getNoOfStudents).reversed();
        List<Course> sortedList = courses.stream()
                .sorted(comparingByNoOfStudents)
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }

    public static void sortCoursesByNoOfStudentsAsc (List<Course> courses) {
        Comparator<Course> comparingByNoOfStudents = Comparator
                //.comparing(Course::getNoOfStudents);  will also work
                .comparing(x -> x.getNoOfStudents());

        List<Course> sortedList = courses.stream()
                .sorted(comparingByNoOfStudents)
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
