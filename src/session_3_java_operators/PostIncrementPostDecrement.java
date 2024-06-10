package session_3_java_operators;

public class PostIncrementPostDecrement {

    public static void main(String[] args) {

        //PostIncrement
        int x = 5;
        int y = x++;

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        //PostDecrement

        int z = 4;
        int w = z--;

        System.out.println("z: " + z);
        System.out.println("w: " + w);
    }
}
