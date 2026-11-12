public class ChainingDemo {

    // Chaining: if / else if / else
    public static String letterGrade(int score) {

        if (score >= 90) {
            return "A";
        } else if (score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            return "F";
        }
    }

    // Nesting: one conditional inside another
    public static String sign(int x) {

        if (x > 0) {
            return "positive";
        } else {
            if (x < 0) {
                return "negative";
            } else {
                return "zero";
            }
        }
    }

    public static void main(String[] args) {

        System.out.println("95 -> " + letterGrade(95));
        System.out.println("85 -> " + letterGrade(85));
        System.out.println("72 -> " + letterGrade(72));
        System.out.println("40 -> " + letterGrade(40));

        System.out.println("5 is " + sign(5));
        System.out.println("-3 is " + sign(-3));
        System.out.println("0 is " + sign(0));
    }
}