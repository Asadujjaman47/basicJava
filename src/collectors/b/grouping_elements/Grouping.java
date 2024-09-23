package collectors.b.grouping_elements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Math", "John", "Smith", "Miami", 19),
                new Student("Programming", "Mike", "Miles", "New York", 21),
                new Student("Math", "Michael", "Peterson", "New York", 20),
                new Student("Math", "James", "Robertson", "Miami", 20),
                new Student("Programming", "Kyle", "Miller", "Miami", 20)
        );

        Map<String, List<Student>> studentsBySubject = students.stream()
                .collect(
                        Collectors.groupingBy(Student::getSubject)
                );

        System.out.println(studentsBySubject);
    }
}
