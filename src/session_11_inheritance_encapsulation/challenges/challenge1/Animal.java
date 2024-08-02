package session_11_inheritance_encapsulation.challenges.challenge1;

public class Animal {
    void makeSound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

class Wolf extends Animal {
    @Override
    void makeSound() {
        System.out.println("Wolf Howls");
    }
}