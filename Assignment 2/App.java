import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

   public static void main(String[] args) {

      int product = multiply();
      System.out.println("The product is: " + product);

      int quotient = divide();
      System.out.println("The quotient is: " + quotient);

      String name = revealmyCrush();
      System.out.println(name);

      String Name = revealmyCrush();
      System.out.println(Name);
   }
  
      static int multiply() {
          System.out.println("Please enter two numbers to Multiply");
          System.out.print("Enter first number: ");
          int x = scan.nextInt();

          System.out.print("Enter second number: ");
          int y = scan.nextInt();
          return x * y;
        }

      static int divide() {
          System.out.println("Please enter two numbers to Divide");
          System.out.print("Enter first number: ");
          int x = scan.nextInt();

          System.out.print("Enter second number: ");
          int y = scan.nextInt();
          return x / y;
        }

      static String revealmyCrush() {
          System.out.println("This method will reveal your crush");
          System.out.print("Enter your name: ");
          String name = scan.nextLine();
        
          System.out.println("Enter crush name: ");
          String crush = scan.nextLine();

          System.out.println("Enter second crush name: ");
          String secondcrush = scan.nextLine();

          return name + " loves " + crush + "\n" + name + " Loves " + secondcrush;
        }
