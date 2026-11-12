import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Score? ");
        int score = in.nextInt();

        String grade;

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Grade: " + grade);

        System.out.print("Day number (1-7)? ");
        int day = in.nextInt();

        String name;

        switch (day) {
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:
                name = "Invalid day";
                break;
        }

        System.out.println("Day: " + name);

        in.close();
    }
}
