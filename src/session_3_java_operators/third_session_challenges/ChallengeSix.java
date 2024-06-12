package session_3_java_operators.third_session_challenges;
import java.util.Scanner;

public class ChallengeSix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        double a = scanner.nextDouble();
        System.out.println("b: ");
        double b = scanner.nextDouble();

        if(a > b){
            System.out.println("a is greater than b");}
        else if(a < b){
            System.out.println("a is less than b");}
        else{
            System.out.println("a is equal to b");
        }
    }}