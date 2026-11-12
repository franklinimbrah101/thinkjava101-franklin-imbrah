import java.util.Scanner;

public class ValidationDemo {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        // Prompt for input
        System.out.print("Enter a number: ");

        // Check input format
        if (!in.hasNextDouble()) {

            String word = in.next();

            System.err.println(word + " is not a number");

            in.close();
            return;
        }

        // Check number range
        double x = in.nextDouble();

        if (x > 0) {

            double y = Math.log(x);

            System.out.println("The log is " + y);

        } else {

            System.out.println("The log is undefined");
        }

        in.close();
    }
}