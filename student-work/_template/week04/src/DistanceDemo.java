public class DistanceDemo {
    public static double distance(double x1, double y1, double x2, double y2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        System.out.println("dx is " + dx); // scaffolding
        System.out.println("dy is " + dy); // scaffolding
        double dsquared = dx * dx + dy * dy;
        System.out.println("dsquared is " + dsquared); // scaffolding
        double result = Math.sqrt(dsquared);
        return result;
    }

    public static void main(String[] args) {
        // Test with a 3-4-5 triangle: we KNOW the right answer is 5.0
        double expected = 5.0;
        double actual = distance(1.0, 2.0, 4.0, 6.0);
        double error = Math.abs(expected - actual);
        System.out.println("expected " + expected + ", actual " + actual + ", error "
                + error);
    }
}