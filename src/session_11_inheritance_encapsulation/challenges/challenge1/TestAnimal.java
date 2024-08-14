package session_11_inheritance_encapsulation.challenges.challenge1;

public class TestAnimal {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        wolf.makeSound();
    }
}
