import java.util.Scanner;
public class birthMonth {
    public static void main(String[] args) {
        int birthMonth = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your month or birth (1-12).");
        if (in.hasNextInt()) {
            birthMonth = in.nextInt();
        }
        if (birthMonth >= 1 && birthMonth <=12){
            System.out.println("Your birth month is " + birthMonth);
        }
        else{
            System.out.println("You hve entered an incorrect month value, try again.");
        }

    }
}
