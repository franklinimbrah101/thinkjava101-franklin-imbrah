public class Week04MethodsStarter {

    public static void greetTwice(String name) {
        System.out.println("Hello, " + name + "!");
        System.out.println("Hello, " + name + "!");
    }

    public static int doubleValue(int value) {
        return value * 2;
    }

    public static void main(String[] args) {
        greetTwice("TODO");
        System.out.println(doubleValue(5));
    }
}
