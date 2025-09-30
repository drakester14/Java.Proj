import java.util.Scanner;
public class ShipCost {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the price of your item");
        int itemPrice = in.nextInt();
        in.nextLine(); // clear the buffer

        double shippingFee = itemPrice * 0.02;
        double totalPrice;
        if (itemPrice < 100) {  // Apply shipping for prices UNDER 100
            totalPrice = shippingFee + itemPrice;
            System.out.println("Your total is " + totalPrice + " (includes " + shippingFee + " shipping)");
        } else {  // No shipping for prices 100 or over
            totalPrice = itemPrice;
            System.out.println("Your total is $" + totalPrice);
        }
    }
}