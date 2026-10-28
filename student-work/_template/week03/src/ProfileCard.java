import java.util.Scanner;

public class ProfileCard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int age;
        String name;

        System.out.print("What is your age? ");
        age = in.nextInt();

        in.nextLine(); // read the leftover newline

        System.out.print("What is your name? ");
        name = in.nextLine();

        System.out.printf("Hello %s, age %d\n", name, age);
        System.out.printf("Next year you will be %d\n", age + 1);

        in.close();
    }
}