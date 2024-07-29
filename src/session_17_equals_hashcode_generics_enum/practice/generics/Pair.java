package session_17_equals_hashcode_generics_enum.practice.generics;

import session_17_equals_hashcode_generics_enum.practice.Employee;

public class Pair<K, V> {

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public Pair() {}

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Alice", 24);
        System.out.println(pair.getKey() + " " + pair.getValue());
        Pair<Employee, String> pair2 = new Pair<>();
    }
}