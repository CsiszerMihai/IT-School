package session_3_java_operators;

public class Variables {

    public static void main(String[] args) {

        int age; //declaration
        age = 27; //initiallization

        int value = 10; //declar si initiez

        int outerVariable = 100;

        if(outerVariable > 50) {
            int innerVariable = 200;
            System.out.println((innerVariable + outerVariable));
        }

        //nu voi putea printa o variabila care exista doar in if, deoarece ea exista doar acolo, o pot printa doar in interior acolo
    }
}
