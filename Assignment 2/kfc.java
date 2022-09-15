import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

   public static void main(String[] args) {
     
     revealmyOrder();

    }
  
  static void revealmyOrder() {
        System.out.println("this is your order:");
        System.out.print("Order 1: ");
        String orderone = scan.nextLine();
        System.out.print("Price 1: ");
        double priceone = scan.nextDouble();
        scan.nextLine();
        
        System.out.print("Order 2: ");
        String ordertwo = scan.nextLine();
        System.out.print("Price 2: ");
        double pricetwo = scan.nextDouble();
        scan.nextLine();

        System.out.print("Order 3: ");
        String orderthree = scan.nextLine();
        System.out.print("Price 3: ");
        double pricethree = scan.nextDouble();

        double total = priceone + pricetwo + pricethree;

        System.out.println("Your orders are " + orderone + ", " + ordertwo + ", and " + orderthree);
        System.out.println("Your total is " + total);
    }
}
