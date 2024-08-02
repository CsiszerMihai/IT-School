package session_10_oop_concepts.challenges.challenge2;

import java.util.HashMap;
import java.util.Map;

public class TeacherTool {
    private Map<String, Student> students;

    public static void main(String[] args) {
        TeacherTool gradebook = new TeacherTool();
        gradebook.addStudent("Alice Johnson", "S001");
        gradebook.addStudent("Bob White", "S002");

        gradebook.assignGrade("S001", 90);
        gradebook.assignGrade("S001", 85);
        gradebook.assignGrade("S002", 78);
        gradebook.assignGrade("S002", 82);

        gradebook.displayAllStudents();
    }

    public TeacherTool() {
        this.students = new HashMap<>();
    }

    public void addStudent(String lastName, String studentID) {
        if (!students.containsKey(studentID)) {
            students.put(studentID, new Student(lastName, studentID));
        } else {
            System.out.println("Student ID already exists.");
        }
    }

    public void assignGrade(String studentID, double grade) {
        Student student = students.get(studentID);
        if (student != null) {
            student.addGrade(grade);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayAllStudents() {
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }
}
