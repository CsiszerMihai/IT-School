package session_4_java_operators_and_loops.challenges;

import java.util.ArrayList;
public class Challenge10 {

    public static void main(String[] args) {
        ArrayList<Integer> listOne = new ArrayList<>();
        listOne.add(1);
        listOne.add(2);
        listOne.add(3);

        ArrayList<Integer> listTwo = listOne;

        listOne.add(4);
        System.out.println(listOne);
        System.out.println(listTwo);
    }
}