package session_13_abstraction.challenge.challenge2;

public class Bank {
    public static void main(String[] args) {
        Bankabs bankA = new BankA();
        Bankabs bankB = new BankB();
        Bankabs bankC = new BankC();

        bankA.getBalance();
        bankB.getBalance();
        bankC.getBalance();
    }
}

abstract class Bankabs {
    abstract void getBalance();
}

class BankA extends Bankabs {
    @Override
    void getBalance() {
        System.out.println("Bank A balance is: 100$");
    }
}

class BankB extends Bankabs {
    @Override
    void getBalance() {
        System.out.println("Bank B balance is: 150$");
    }
}

class BankC extends Bankabs {
    @Override
    void getBalance() {
        System.out.println("Bank C balance is: 200$");
    }
}