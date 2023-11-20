package section8;

import java.util.ArrayList;
import java.util.List;

public class ModifyingListEasy {
    public static void main (String[] args) {
        System.out.println("******************** Replace All Courses With Upper Case Chars ************************");
        replaceAllCoursesWithUpperCaseChars();
        System.out.println("\n");

        System.out.println("******************** Remove Courses With Title Length Less Than 6 ************************");
        removeCoursesWithTitleLengthLessThan6();
        System.out.println();

    }

    private static void removeCoursesWithTitleLengthLessThan6() {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        List<String> modifiableCourses = new ArrayList<>(courses);
        modifiableCourses.removeIf(course -> course.length() < 6);
        System.out.print(modifiableCourses);
    }

    private static void replaceAllCoursesWithUpperCaseChars() {
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        List<String> modifiableCourses = new ArrayList<>(courses);
        modifiableCourses.replaceAll(String::toUpperCase);
        System.out.print(modifiableCourses);
    }
}
