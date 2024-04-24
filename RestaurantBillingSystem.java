import java.util.Scanner;

class RestaurantBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Restaurant Billing System");

        System.out.print("Enter the number of items: ");
        int numItems = scanner.nextInt();

        double totalBill = 0;

        for (int i = 1; i <= numItems; i++) {
            System.out.println("\nItem " + i + ":");
            System.out.print("Name: ");
            String itemName = scanner.next();
            System.out.print("Price: ");
            double itemPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            double itemTotal = itemPrice * quantity;
            totalBill += itemTotal;

            System.out.println("Total for " + itemName + ": $" + itemTotal);
        }

        System.out.println("\nTotal bill amount: $" + totalBill);

        scanner.close();
    }
}
