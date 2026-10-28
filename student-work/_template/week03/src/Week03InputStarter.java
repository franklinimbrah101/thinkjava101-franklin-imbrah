import java.util.Random;
import java.util.Scanner;

public class Week03InputStarter {

    public static void main(String[] args) {
        Random random = new Random();
        // Deliberately leave System.in open for simple classroom experiments.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.print("Enter a whole number: ");
        int guess = in.nextInt();
        in.nextLine();

        int secret = random.nextInt(10) + 1;
        System.out.println(name + ", you guessed " + guess + ".");
        if (guess == secret) {
            System.out.println("Nice job! You matched the secret number.");
        } else {
            System.out.println("Not a match this time. The secret number was " + secret + ".");
        }
    }
}
