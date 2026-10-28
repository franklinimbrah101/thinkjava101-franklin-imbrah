public class Question3 {
    public static void main(String[] args) {
        // Type cast: (int) throws away the fractional part
        double pi = 3.14159;
        int x = (int) pi;
        System.out.println("(int) pi = " + x);

        // Cast happens BEFORE the multiplication
        double y = (int) pi * 20.0;
        System.out.println("(int) pi * 20.0 = " + y);

        // Division and remainder together: 76 inches -> feet and inches
        final int IN_PER_FOOT = 12;
        int totalInches = 76;
        int feet = totalInches / IN_PER_FOOT;
        int inches = totalInches % IN_PER_FOOT;
        System.out.println(totalInches + " in = " + feet + " ft, " + inches + " in");
    }
}