package session_9_arrays.challenges;

import java.util.LinkedList;
import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        LinkedList<String> studentNames = new LinkedList<>();
        studentNames.add("Velma");
        studentNames.add("Daphne");
        studentNames.add("Fred");
        studentNames.add("Scooby");
        studentNames.add("Shaggy");

        Scanner sc = new Scanner(System.in);
        System.out.println("Student you want to remove:");
        String student = sc.nextLine();

        if (studentNames.contains(student)) {
            studentNames.remove(student);
        }

        System.out.println("Current students: " + studentNames);
        sc.close();
    }
}