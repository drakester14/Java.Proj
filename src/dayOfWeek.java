import java.util.Scanner;
public class dayOfWeek {
    public static void main(String[] args) {
        int day = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day of the week (1-7)");
        day = in.nextInt();

        if (day == 1) {
            System.out.println("The day entered is Sunday");
        } else if (day == 2) {
            System.out.println("The day entered is Monday");
        } else if (day == 3) {
            System.out.println("The day entered is Tuesday");
        } else if (day == 4) {
            System.out.println("The day entered is Wednesday");
        } else if (day == 5) {
            System.out.println("The day entered is Thursday");
        } else if (day == 6) {
            System.out.println("The day entered is Friday");
        } else if (day == 7) {
            System.out.println("The day entered is Saturday");
        } else {
            System.out.println("Invalid input, please try again.");}
    }
}


