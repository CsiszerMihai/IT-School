package session_13_abstraction.challenge.challenge1;

public class Main {
    public static void main(String[] args) {
        Parent first = new Subclass();
        first.message();

        Parent second = new Subclass2();
        second.message();
    }
}

abstract class Parent {
    abstract void message();
}

class Subclass extends Parent {
    @Override
    void message() {
        System.out.println("This is first subclass");
    }
}

class Subclass2 extends Parent {
    @Override
    void message() {
        System.out.println("This is second subclass");
    }
}