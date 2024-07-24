package session_9_arrays.challenges;

import java.util.ArrayList;

public class Challenge3 {

    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();
        studentList.add("John Smith");
        studentList.add("Andrew Carter");
        studentList.add("Loran Gray");
        studentList.add("Peter Griffin");
        studentList.add("Erika Parker");
        studentList.add("Barrack Obama");
        studentList.add("Henry Great");
        studentList.add("Bruce Wayne");
        studentList.add("Kent Clark");
        studentList.add("Johnny Brown");
        studentList.add("Jack Sparrow");

        graduateStudentList.addAll(studentList);
        for (String student : graduateStudentList) {
            System.out.println(student + " ");
        }
    }
}