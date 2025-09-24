public class YearlyMaintenance {
    public static void main(String[] args) {
        System.out.println("Enter your maintenance for the Spring season.");
        double springCost = 4000;
        System.out.println("Your maintenance cost for Spring the season is " + springCost );
        System.out.println("Enter your maintenance for the Summer season.");
        double summerCost = 5000;
        System.out.println("Your maintenance cost for the Summer season is " + summerCost );
        System.out.println("Enter your maintenance for the Fall season.");
        double fallCost = 3500;
        System.out.println("Your maintenance cost for the Fall season is " + fallCost );
        System.out.println("Enter your maintenance for the Winter season.");
        double winterCost = 6000;
        System.out.println("Your maintenance cost for the Winter season is " + winterCost);
        double yearlyCost = springCost + summerCost + fallCost + winterCost;
        System.out.println("Your maintenance cost for the year is " + yearlyCost);

    }
}