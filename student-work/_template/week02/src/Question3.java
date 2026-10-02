public class Question3 {
    public static void main(String[] args) {
        // int / int uses integer division, even when assigned to a double
        double y1 = 1 / 3;
        System.out.println(y1);
        // At least one operand must be a double to get floating-point division
        double y2 = 1.0 / 3.0;
        System.out.println(y2);
        // Applying the same fix to the hour/minute example from before
        double minute = 59.0;
        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute / 60.0);
    }
}