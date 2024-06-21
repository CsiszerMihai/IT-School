package session_5_flow_control.challenges;

import java.util.Scanner;

public class Challenge5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many fibonacci numbers would you like to print?");
        int nFibonacci = sc.nextInt();
        int x = 0;
        int y = 1;

        for (int index = 0; index < nFibonacci; index++) {
            System.out.println(x);
            int z = x + y;
            x = y;
            y = z;
        }
    }
}