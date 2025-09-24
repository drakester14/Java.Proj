public class monthlyBalance {
    public static void main(String[] args) {
         int balance = 5000;
         double interest = 0.17;
         double oneMonth = balance * interest;
         double oneBalance = oneMonth + balance;
         System.out.println("Your balance for one month is " + oneBalance);
          double twoMonth = oneBalance * interest;
        double finalBalance = twoMonth + oneBalance;
        System.out.println("Your balance after two months is " + finalBalance);

    }
}
