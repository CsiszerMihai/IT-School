package session_3_java_operators;

public class Logical_Compl_and_Negociation_Ops {

    public static void main(String[] args) {
        boolean isFirstTime = true;
        boolean isRegisteredUser = false;

        System.out.println("Default value: isFirstTime " + isFirstTime);
        System.out.println("Updated value: isFirstTime " + !isFirstTime);

        System.out.println("Default value: isRegistered " + isRegisteredUser);
        System.out.println("Updated value: isRegistered " + !isRegisteredUser);
    }
}