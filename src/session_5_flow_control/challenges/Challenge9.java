package session_5_flow_control.challenges;

public class Challenge9 {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8};

        for(int number : array){
            if(number % 2 == 0) {
                System.out.println(number + " is even");
            }else {
                System.out.println(number + " is odd");
            }
        }
    }
}