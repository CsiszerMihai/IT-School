package session_11_inheritance_encapsulation.practice;

public class Vehicle {

    private String brand;
    private int speed;

    public void accelerate() {
        speed += 10;
    }

    public void brake() {
        speed -= 10;
    }
}

class Car extends Vehicle {

    @Override
    public void accelerate() {
        super.accelerate();
    }
}

class Bike extends Vehicle {

    @Override
    public void accelerate() {
        super.accelerate();
    }
}