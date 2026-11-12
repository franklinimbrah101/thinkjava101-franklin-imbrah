import java.util.Scanner;

public class SafeSqrt {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");

        if (!in.hasNextDouble()) {
            String word = in.next();

            System.err.println(word + " is not a number");

            return;
        }

        double x = in.nextDouble();

        if (x < 0) {
            System.out.println("Square root is undefined for negative numbers");
        } else {
            System.out.printf("Square root: %.3f\n", Math.sqrt(x));
        }

        in.close();
    }
}
