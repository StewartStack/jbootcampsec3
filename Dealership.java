import java.util.Scanner;

//import javax.xml.transform.Source;

public class Dealership {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          System.out.println("Welcome to the Java Dealership");
          System.out.println(" - Select option 'a' to buy a car");
          System.out.println(" - Select option 'b' to sell a car");

          String option = scan.nextLine();

          switch (option) {
               case "a": 
                    //System.out.println("You chose option " + option);
                    System.out.println("What is your budget?");
                    int budget = scan.nextInt();
                    if (budget >= 10000) {
                         System.out.println("A nissan Altima is available.");
                         System.out.println("\nDo you have insurance? Type 'yes' or 'no");
                         scan.nextLine();
                         String insurance = scan.nextLine();
                         System.out.println("\nDo you have license? Type 'yes' or 'no'");
                         String license = scan.nextLine();
                         System.out.println("\nWhat is your credit score?");
                         int creditScore = scan.nextInt();
                         if (insurance.equals("yes") && license.equals("yes") && creditScore > 660) {
                              System.out.println("\nSold! Pleasure doing business with you");
                         } else {
                              System.out.println("\nSorry! Not Eligible");
                         }
                    } else {
                         System.out.println(("\nNo cars are available."));
                    }
                    break;
               case "b":
                    System.out.println("\nWhat is your car valued at?");
                    int value = scan.nextInt();
                    System.out.println("\nWhat is your car selling price?");
                    scan.nextLine();
                    int price = scan.nextInt();
                    if (value > price && price < 30000) {
                         System.out.println("\nWe will buy your can. Pleasure doing business with you!");
                    } else {
                         System.out.println("\nSorry, we're not interested!");
                    }
                    break;
               default:
                    System.out.println("\nInvalid option");
                    
          }

          scan.close();
     }
}
