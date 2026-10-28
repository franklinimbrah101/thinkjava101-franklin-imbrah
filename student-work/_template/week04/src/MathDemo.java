public class MathDemo {
    public static void main(String[] args) {
        // Math is in java.lang, so no import is needed
        double root = Math.sqrt(17.0);
        System.out.printf("sqrt(17.0) = %.4f\n", root);

        // The int 25 is converted to 25.0 automatically
        System.out.println("sqrt(25) = " + Math.sqrt(25));

        // PI is a constant: capital letters, no parentheses
        double degrees = 90;
        double angle = degrees / 180.0 * Math.PI;
        System.out.printf("90 degrees = %.4f radians\n", angle);
        System.out.printf("toRadians(180.0) = %.4f\n", Math.toRadians(180.0));

        // round returns a long (a bigger kind of int)
        long x = Math.round(Math.PI * 20.0);
        System.out.println("round(PI * 20.0) = " + x);

        // pow takes two arguments: base and exponent
        System.out.println("pow(2.0, 10.0) = " + Math.pow(2.0, 10.0));
    }
}