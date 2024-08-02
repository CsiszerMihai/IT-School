package session_11_inheritance_encapsulation.challenges.challenge2.hierarchical_inheritance;

public class Boat {
    private long length;
    private long weight;

    private void sail() {
        System.out.println("Boat is sailing");
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }
}

class SpeedBoat extends Boat {
    private long maxSpeed;
    private EngineType engineType;

    private void turboBoost() {
        System.out.println("Turbo boost active");
    }

    public long getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(long maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}

class FishingBoat extends Boat {
    private long fishCapacity;
    private NetType typeOfNet;

    private void castNet() {
        System.out.println("Net has been cast");
    }

    public long getFishCapacity() {
        return fishCapacity;
    }

    public void setFishCapacity(long fishCapacity) {
        this.fishCapacity = fishCapacity;
    }

    public NetType getTypeOfNet() {
        return typeOfNet;
    }

    public void setTypeOfNet(NetType typeOfNet) {
        this.typeOfNet = typeOfNet;
    }
}