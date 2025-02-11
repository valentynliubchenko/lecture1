package ua.nure;

public class MyApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("sum =  " + calc.sum(10, 20));
    }

    public static String generateGreeting(String name) {
        return "Hello " + name;
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
