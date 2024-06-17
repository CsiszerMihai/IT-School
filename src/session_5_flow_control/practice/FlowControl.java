package session_5_flow_control.practice;

import java.util.ArrayList;
import java.util.List;

public class FlowControl {

    public static void main(String[] args) {
        printNumberWithWhile(10);
        printNumberWithDoWhile(10);
        printNumberWithFor(10);

        int[] arrayExample = {1, 2, 3};

        List<String> cityList = new ArrayList<>();
        cityList.add("New York");
        cityList.add("Bucharest");
        cityList.add("Hong Kong");
        cityList.add("Paris");

        printListWithForEach(cityList);
        printCitiesWithFor(cityList);
    }

    public static void printNumberWithWhile(int input) {
        int number = 1;

        while (number <= input) {
            System.out.println(number);
            ++number;
        }
    }

    public static void printNumberWithDoWhile(int input) {
        int x = 1;
        do {
            System.out.println(x);
            x++;
        } while (x <= input);
    }

    public static void printNumberWithFor(int input) {
        for (int x = 1; x <= input; x++) {
            System.out.println(x);
        }
    }

    public static void printListWithForEach(List<String> list) {
        for (String city : list) {
            System.out.println(city);
        }
    }

    public static void printCitiesWithFor(List<String> list) {
        for (int x = 0; x < list.size(); x++) {
            System.out.println(list.get(x));
        }
    }
}