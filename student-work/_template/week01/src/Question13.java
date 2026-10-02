public class Question13 {
    public static void main(String[] args) {
        int age = 20;
        String status = age >= 18 ? "Adult" : "Minor";
        System.out.println(status); // Adult

        int n = 7;
        String kind = n % 2 == 0 ? "even" : "odd";
        System.out.println(kind); // odd
    }
}