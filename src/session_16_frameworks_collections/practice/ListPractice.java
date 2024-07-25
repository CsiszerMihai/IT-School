package session_16_frameworks_collections.practice;

import java.util.*;

public class ListPractice {

    public static void main(String[] args) {
        List<Integer> myList = initializeList();

        List<Integer> updatedList = updateList(myList, 3, 7);
        System.out.println(updatedList);

        boolean isElementPresent = isElementPresent(myList, 3);
        System.out.println(isElementPresent);
    }

    public static boolean isElementPresent(List<Integer> list, int value) {
        return list.contains(value);
    }

    public static List<Integer> updateList(List<Integer> list, int index, int value) {
        if (index < 0 || index > list.size()) {
            System.out.println("Invalid index");
            return list;
        }

        List<Integer> result = new ArrayList<>(list);
        result.set(index, value);

        return result;
    }

    public static List<Integer> initializeList() {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        return list;
    }
}