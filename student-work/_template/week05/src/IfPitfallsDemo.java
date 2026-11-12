public class IfPitfallsDemo {

    public static void main(String[] args) {

        int x = 1;

        // Mistake 1: Semicolon after the condition
        if (x % 2 == 0); {
            System.out.println(
                "Mistake 1: runs even though x = " + x + " is odd");
        }

        // Mistake 2: No braces
        if (x > 5)
            System.out.println("x is big");

        System.out.println("Mistake 2: this line ALWAYS runs");

        // Correct way: Always use braces
        if (x > 5) {
            System.out.println("x is big");
            System.out.println("this line only runs when x > 5");
        }
    }
}