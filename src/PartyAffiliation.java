import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt user for party affiliation
        System.out.print("Enter your party affiliation (D for Democrat, R for Republican, I for Independent): ");
        String affiliation = scanner.nextLine().toUpperCase();
        // Cascaded if-then-else structure
        if (affiliation.equals("D")) {
            System.out.println("You get a Democratic Donkey!");
        } else if (affiliation.equals("R")) {
            System.out.println("You get a Republican Elephant!");
        } else if (affiliation.equals("I")) {
            System.out.println("You get an Independent Person!");
        }
    }
}
