public class IfElse {
     
     public static void main(String[] args) {
          
          int grade = 65;

          if (grade >= 80) {
               System.out.println("You got an A!"); //false
          } else if (grade >= 70) {
               System.out.println("you got a B!"); //false
          } else if (grade >= 60) {
               System.out.println("you got a C!"); //true
          } else if (grade >= 50) {
               System.out.println("you got a D!"); //ignored as condition met
          } else {
               System.out.println("you got a F!"); // ignored as condition met
          }
     }
}
     


