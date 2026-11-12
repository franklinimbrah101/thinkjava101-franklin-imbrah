import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = in.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }

        System.out.println("Over 100? " + (n > 100));

        in.close();
    }
}
