import java.util.Scanner;

public class CircleTools {

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double hypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2.0) + Math.pow(b, 2.0));
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Radius? ");
        double radius = in.nextDouble();

        double area = circleArea(radius);

        System.out.printf("Area: %.2f\n", area);

        System.out.println("Rounded area: " + Math.round(area));

        System.out.printf("Hypotenuse of 3 and 4: %.2f\n",
                hypotenuse(3.0, 4.0));

        in.close();
    }
}