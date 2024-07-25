package session_16_frameworks_collections.practice;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {
        Map<String, Integer> students = initializeMap();

        int retrievedValue = retrieveValue(students, "Alice");
        System.out.println("ALice's age is: " + retrievedValue);

        updatedMap(students, "Bob", 22);

        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            System.out.println("Stundent's name: " + entry.getKey() + " and stundent's age is: " + entry.getValue());
        }
        System.out.println(students);
    }

    public static void updatedMap(Map<String, Integer> map, String key, int value) {
        map.put(key, value);
    }

    public static int retrieveValue(Map<String, Integer> map, String key) {
        return map.get(key);
    }

    public static Map<String, Integer> initializeMap() {
        Map<String, Integer> students = new HashMap<>();
        students.put("Alice", 21);
        students.put("John", 23);
        students.put("Bob", 24);

        return students;
    }
}