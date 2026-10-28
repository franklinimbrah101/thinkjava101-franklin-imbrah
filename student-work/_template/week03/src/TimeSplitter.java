import java.util.Scanner;

public class TimeSplitter {
    public static void main(String[] args) {
        final int SEC_PER_HOUR = 3600;
        final int SEC_PER_MIN = 60;

        int totalSeconds, hours, minutes, seconds;
        Scanner in = new Scanner(System.in);

        System.out.print("Total seconds? ");
        totalSeconds = in.nextInt();

        hours = totalSeconds / SEC_PER_HOUR;

        int left = totalSeconds % SEC_PER_HOUR;

        minutes = left / SEC_PER_MIN;
        seconds = left % SEC_PER_MIN;

        System.out.printf("%d seconds = %d h, %d min, %d s\n",
                totalSeconds, hours, minutes, seconds);

        // Bonus: calculate hours as a decimal
        double hoursExact = totalSeconds / 3600.0;
        System.out.printf("Hours as an integer: %d\n", (int) hoursExact);
        System.out.printf("Exact hours: %.2f\n", hoursExact);

        in.close();
    }
}