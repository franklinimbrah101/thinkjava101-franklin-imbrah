public class ParametersDemo {
    public static void printTwice(String s) {
        System.out.println(s);
        System.out.println(s);
    }

    public static void printTime(int hour, int minute) {
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
    }

    public static void main(String[] args) {
        // The argument is assigned to the parameter s
        printTwice("Don't make me say this twice!");

        // A variable (or any expression) can be an argument
        String message = "Never say never.";
        printTwice(message);

        // Two parameters need two arguments, in the same order
        int hour = 11;
        int minute = 59;
        printTime(hour, minute);

        // Java evaluates the arguments first: hour + 1 is 12
        printTime(hour + 1, 0);
    }
}