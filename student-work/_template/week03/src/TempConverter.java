import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        final double FREEZING = 32.0;
        final double RATIO = 5.0 / 9.0;

        double fahrenheit;
        double celsius;

        Scanner in = new Scanner(System.in);

        System.out.print("Temperature in Fahrenheit? ");
        fahrenheit = in.nextDouble();

        celsius = (fahrenheit - FREEZING) * RATIO;

        System.out.printf("%.1f F = %.1f C\n", fahrenheit, celsius);

        in.close();
    }
}