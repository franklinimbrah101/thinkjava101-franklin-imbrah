public class ReturnValuesDemo {
    // A void method: no return value
    public static void printArea(double area) {
        System.out.printf("The area is %.2f\n", area);
    }

    // A value-returning method: declares a return type and uses return
    public static double calculateArea(double radius) {
        double result = Math.PI * radius * radius;
        return result;
    }

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    public static void main(String[] args) {
        // Save the return value in a variable...
        double area = calculateArea(5.0);

        // ...then pass it to a void method on a line by itself
        printArea(area);

        // Or use the return value inside an expression
        System.out.printf("Twice the area of radius 1.0: %.4f\n", 2 *
                calculateArea(1.0));
        System.out.println("multadd(1.0, 2.0, 3.0) = " + multadd(1.0, 2.0, 3.0));
    }
}