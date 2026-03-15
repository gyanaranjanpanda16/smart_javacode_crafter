package com.gyanaranjan.Java8ConceptProgram;


import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;
        import java.util.stream.Collectors;

class Student {
    private String name;
    private List<Integer> marks;

    public Student(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}

public class StreamProg02 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", Arrays.asList(80, 75, 65)));
        students.add(new Student("Bob", Arrays.asList(60, 55, 70)));
        students.add(new Student("Charlie", Arrays.asList(90, 85, 80)));

        List<Student> updatedStudents = students.stream()
                .map(student -> {
                    double average = student.getMarks().stream().mapToDouble(Integer::doubleValue).average().orElse(0);
                    if (average < 70) {
                        List<Integer> updatedMarks = student.getMarks().stream()
                                .map(mark -> mark + 10)
                                .collect(Collectors.toList());
                        return new Student(student.getName(), updatedMarks);
                    } else {
                        return student;
                    }
                })
                .collect(Collectors.toList());

        System.out.println("Original Students: " + students);
        System.out.println("Updated Students: " + updatedStudents);
    }
}
