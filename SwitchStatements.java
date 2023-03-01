public class SwitchStatements {
     public static void main(String[] args) {
          int month = 5; //This stores the variable month

          int month2 = month; // initializes new variable month2 adding it to month

          month2 -= 10;

          switch (month2) {
               case 1: System.out.println("January"); // will print this if matches number
               break; // will stop if case met.
               case 2: System.out.println("February");
               break;
               case 3: System.out.println("March");
               break;
               case 4: System.out.println("April");
               break;
               case 5: System.out.println("May");
               break;
               case 6: System.out.println("June");
               break;
               case 7: System.out.println("July");
               break;
               case 8: System.out.println("August");
               break;
               case 9: System.out.println("September");
               break;
               case 10: System.out.println("October");
               break;
               case 11: System.out.println("November");
               break;
               case 12: System.out.println("December");
               break;
               default: System.out.println("Please enter Valid Month");
               break;
          }
     }
     
}
