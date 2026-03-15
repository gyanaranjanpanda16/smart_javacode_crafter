package com.gyanaranjan.Java8ConceptProgram.TrickyQuestionOnJava8RealTime;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
    private String name;
    private List<String> courses;

    public Student(String name, List<String> courses) {
        this.name = name;
        this.courses = courses;
    }

    public List<String> getCourses() {
        return courses;
    }
}

public class Main1 {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Alice", Arrays.asList("Math", "Physics")),
                new Student("Bob", Arrays.asList("Chemistry", "Biology")),
                new Student("Charlie", Arrays.asList("History", "Geography"))
        );

        // Using map to extract courses
        List<List<String>> coursesListMap = students.stream()
                .map(Student::getCourses) // Map each student to their list of courses
                .collect(Collectors.toList()); // Collect the lists into a list of lists

        System.out.println("Using map:");
        System.out.println(coursesListMap);

        // Using flatMap to extract courses
        List<String> coursesListFlatMap = students.stream()
                .flatMap(student -> student.getCourses().stream()) // Flatten the nested lists
//                .distinct() // Get distinct courses
                .collect(Collectors.toList()); // Collect the courses into a list

        System.out.println("\nUsing flatMap:");
        System.out.println(coursesListFlatMap);
    }
}

