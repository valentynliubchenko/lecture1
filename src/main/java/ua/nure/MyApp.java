package ua.nure;

public class MyApp {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println(generateGreeting(args[0]));
        } else {

            System.out.println("Hello world");

        }
    }

    public static String generateGreeting(String name) {
        return "Hello " + name;
    }
}
