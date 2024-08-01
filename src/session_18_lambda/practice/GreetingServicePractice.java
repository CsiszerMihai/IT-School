package session_18_lambda.practice;

public class GreetingServicePractice {

    public static void main(String[] args) {
        // using anon cls
        GreetingService anonGreetingService = new GreetingService() {
            @Override
            public void greet(String message) {
                System.out.println("Hello World!");
            }
        };

        GreetingService lambdaGreetingService = input -> System.out.println(input + " from lambda expression");
        lambdaGreetingService.greet("Hello World");
    }
}