public class NameCard {

    public static void printTwice(String s) {
        System.out.println(s);
        System.out.println(s);
    }

    public static void printCard(String name, int age) {
        System.out.print("Name: " + name + ", ");
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        printTwice("Methods are reusable!");

        printCard("Ada", 36);

        int age = 40;

        printCard("Grace", age + 1);
    }
}