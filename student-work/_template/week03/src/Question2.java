import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        int inch;
        double cm;
        Scanner in = new Scanner(System.in);

        System.out.print("How many inches? ");
        inch = in.nextInt();
        cm = inch * CM_PER_INCH;
        System.out.println(inch + " inches = " + cm + " centimeters");
    }
}