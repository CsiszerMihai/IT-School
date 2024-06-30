package session_8_recap.challenges;

import java.util.Scanner;

public class Challenge1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two numbers that you'd like to operate with.");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter an operation you would like to perform on these two numbers: +, -, * or /");
        String operationSign = sc.nextLine();
        int resultSum = firstNumber + secondNumber;
        int resultSubtract = firstNumber - secondNumber;
        int resultMultiply = firstNumber * secondNumber;
        int resultDivision = firstNumber / secondNumber;
        switch (operationSign){
            case "+":
                System.out.println(resultSum);
                break;
            case "-":
                System.out.println(resultSubtract);
                break;
            case "*":
                System.out.println(resultMultiply);
                break;
            case "/":
                System.out.println(resultDivision);
                break;
            default:
                System.out.println("Error on user input, try again");
        }
    }
}
