package session_11_inheritance_encapsulation.challenges.challenge2.single_inheritance;

public class Bicycle {
    private int speed;
    private int gear;

    private void changeGear() {
        if (gear == 0) {
            gear++;
        } else {
            gear--;
        }
    }

    private void speedUp() {
        speed += 10;
    }

    private void applyBrake() {
        speed -= 10;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}

class MountainBike extends Bicycle {
    private TireType tireType;
    private int suspension;

    private void adjustSuspension() {
        suspension += 10;
    }

    public TireType getTireType() {
        return tireType;
    }

    public void setTireType(TireType tireType) {
        this.tireType = tireType;
    }

    public int getSuspension() {
        return suspension;
    }

    public void setSuspension(int suspension) {
        this.suspension = suspension;
    }
}