package session_9_arrays.challenges;

import java.util.ArrayList;
import java.util.List;

public class Challenge2 {

    public static void main(String[] args) {
        List<String> wishList = new ArrayList<>();
        wishList.add("Car");
        wishList.add("Robot");
        wishList.add("Candy");
        wishList.add("Train");

        for (String element : wishList) {
            System.out.println(element + " ");
        }
    }
}