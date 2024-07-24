package session_9_arrays.challenges;

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Tokyo");
        cityList.add("Paris");
        cityList.add("Rio");
        cityList.add("London");
        cityList.add("Berlin");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a city name: ");
        String city = sc.nextLine();

        if (cityList.contains(city)) {
            System.out.println("City already exists on the list.");
        } else {
            cityList.add(city);
        }

        System.out.println("Current city list: " + cityList);
    }
}