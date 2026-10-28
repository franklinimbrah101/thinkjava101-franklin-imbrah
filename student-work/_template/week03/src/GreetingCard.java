import java.util.Scanner;

public class GreetingCard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String name;
        String food;

        System.out.print("What is your name? ");
        name = in.nextLine();

        System.out.print("What is your favorite food? ");
        food = in.nextLine();

        System.out.println("Nice to meet you, " + name + "! Let's eat some " + food + ".");

        in.close();
    }
}