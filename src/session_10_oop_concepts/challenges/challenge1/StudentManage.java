package session_10_oop_concepts.challenges.challenge1;

import java.util.ArrayList;
import java.util.List;

public class StudentManage {
    private List<Students> students = new ArrayList<>();

    public void addStudent(Students student) {
        students.add(student);
    }

    public Students getStudent(int studentId) {
        for (Students student : students) {
            if (student.getStudentId() == studentId) {
                return student;
            }
        }
        return null;
    }

    public void updateStudent(Students updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentId() == updatedStudent.getStudentId()) {
                students.set(i, updatedStudent);
                break;
            }
        }
    }

    public void deleteStudent(int studentId) {
        students.removeIf(student -> student.getStudentId() == studentId);
    }

    public List<Students> getAllStudents() {
        return new ArrayList<>(students);
    }
}