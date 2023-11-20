package section3;

import java.util.List;
import java.util.stream.Collectors;

public class E11_CreateListWithLengthOfCourses {
    public static void main(String[] args) {
        List<Integer> coursesLengthList = getCoursesLengthList(List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes"));
        System.out.println(coursesLengthList);
    }

    private static List<Integer> getCoursesLengthList(List<String> courses) {
        return courses.stream()
                .map(course -> course.length())
                .collect(Collectors.toList());
    }
}
