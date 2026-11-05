public class Distance {

    public static double distance(double x1, double y1,
                                  double x2, double y2) {

        double dx = x2 - x1;

        double dy = y2 - y1;

        double dsquared = dx * dx + dy * dy;

        double result = Math.sqrt(dsquared);

        return result;
    }

    public static void main(String[] args) {

        System.out.printf("Distance (1,2) to (4,6): %.1f\n",
                distance(1.0, 2.0, 4.0, 6.0));

        System.out.printf("Distance (0,0) to (6,8): %.1f\n",
                distance(0.0, 0.0, 6.0, 8.0));
    }
}