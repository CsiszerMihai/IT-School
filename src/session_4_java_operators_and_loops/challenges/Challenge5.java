package session_4_java_operators_and_loops.challenges;

public class Challenge5 {

    public static void main(String[] args) {


        for(int x = 1; x < 11; x++){
            System.out.println(x);
        }

        System.out.println("And now the even numbers count.");

        for(int y = 1; y <= 10; y++){
            if(y % 2 == 0){
                System.out.println(y);
            }
        }
    }
}