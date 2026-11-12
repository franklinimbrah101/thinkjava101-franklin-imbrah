public class LogicalDemo {

    public static boolean slowCheck() {

        System.out.println(" (slowCheck ran)");

        return true;
    }

    public static void main(String[] args) {

        int x = 5;
        int y = 0;

        System.out.println("x > 0 && x < 10 is " +
                (x > 0 && x < 10));

        System.out.println("x < 0 || x > 10 is " +
                (x < 0 || x > 10));

        System.out.println("!(x > 0) is " + !(x > 0));

        // Short-circuit evaluation

        System.out.println("true || slowCheck():");
        System.out.println(" " + (true || slowCheck()));

        System.out.println("false && slowCheck():");
        System.out.println(" " + (false && slowCheck()));

        System.out.println("true && slowCheck():");
        System.out.println(" " + (true && slowCheck()));

        // Prevent division by zero

        if (y != 0 && x / y > 1) {

            System.out.println("x / y is bigger than 1");

        } else {

            System.out.println(
                    "skipped: y is zero, so x / y never ran");
        }
    }
}