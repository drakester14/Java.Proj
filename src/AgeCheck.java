import java.util.Scanner;
public class AgeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user for age
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();
        if (age >= 21) {
            System.out.println("You get a wrist band!");
        }
    }
}
