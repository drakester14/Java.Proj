import java.util.Scanner;
public class Profile {
    public static void main(String[] args) {
Scanner in = new Scanner(System.in);
double balance = 0;
final double INTEREST_RATE = 0.1;
double interest = 0;
        System.out.println("Enter the initial balance. ");
        if (in.hasNextDouble()) {
            balance = in.nextDouble();
            in.nextLine();
            interest = balance * INTEREST_RATE;
            System.out.println("The interest rate after one month is " + interest);
        }
        else {
            System.out.println("Invalid input, please enter a number.");
        }
        System.out.println("The program has ended. ");
    }
}