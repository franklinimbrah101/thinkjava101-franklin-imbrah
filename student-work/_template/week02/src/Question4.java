public class Question4 {
    public static void main(String[] args) {
        // Java evaluates left to right: 1 + 2 is computed first (3),
        // then 3 + "Hello" concatenates as text
        System.out.println(1 + 2 + "Hello");
        // Here "Hello" + 1 concatenates immediately, then + 2 concatenates again
        System.out.println("Hello" + 1 + 2);
        // Parentheses override the default order of operations
        System.out.println("Hello" + (1 + 2));
    }
}