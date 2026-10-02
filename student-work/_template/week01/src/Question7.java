public class Question7 {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        System.out.println(x == y); // true
        System.out.println(x != y); // false
        String a = new String("Java");
        String b = new String("Java");
        System.out.println(a == b); // false
        System.out.println(a.equals(b)); // true
    }
}