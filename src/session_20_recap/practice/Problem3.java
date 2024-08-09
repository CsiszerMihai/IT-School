package session_20_recap.practice;

import java.util.*;

public class Problem3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number");
        int secondNumber = sc.nextInt();
        System.out.println("Enter third number");
        int thirdNumber = sc.nextInt();
        System.out.println("Enter fourth number");
        int fourthNumber = sc.nextInt();

        List<Integer> myList = Arrays.asList(firstNumber, secondNumber, thirdNumber, fourthNumber);

        Optional<Integer> min = myList.stream().min(Integer::compareTo);
        min.ifPresent(System.out::println);

        Optional<Integer> max = myList.stream().max(Integer::compareTo);
        max.ifPresent(System.out::println);
    }
}