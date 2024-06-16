package session_4_java_operators_and_loops.challenges;

public class Challenge7 {

    public static void main(String[] args) {
        double sideOne = 3;
        double sideTwo = 4;
        double sideThree = 5;

        String triangleType = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral"
                : (sideOne == sideTwo || sideOne == sideThree || sideTwo == sideThree) ? "Isosceles"
                : "Scalene";
        System.out.println(triangleType);
    }
}