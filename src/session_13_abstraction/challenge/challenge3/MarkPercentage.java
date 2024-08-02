package session_13_abstraction.challenge.challenge3;

public class MarkPercentage {
    public static void main(String[] args) {
        Marks studentA = new A(70, 80, 95);
        Marks studentB = new B(93, 96, 94, 90);

        System.out.println(studentA.getPercentage());
        System.out.println(studentB.getPercentage());
    }
}

abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private int mark1, mark2, mark3;

    public A(int mark1, int mark2, int mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    @Override
    double getPercentage() {
        int total = mark1 + mark2 + mark3;
        return (total / 3);
    }
}

class B extends Marks {
    private int mark1, mark2, mark3, mark4;

    public B(int mark1, int mark2, int mark3, int mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }

    @Override
    double getPercentage() {
        int total = mark1 + mark2 + mark3 + mark4;
        return (total / 4);
    }
}