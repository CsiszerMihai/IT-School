package session_5_flow_control.challenges;

public class Challenge8 {

    public static void main(String[] args) {
        int nFibonacci = 10;
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
