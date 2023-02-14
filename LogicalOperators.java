public class LogicalOperators {
    public static void main(String[] args) {
          int chemistryGrade = 67;
          int englishGrade = 65;
          String language = "Java";

          if (chemistryGrade > 75 || englishGrade > 75 || language.equals("Java")) {
               System.out.println("Congrats, you passsed!");
          } else {
               System.out.println("You didn't pass!");
          }
          
          int credits = 56; // both or these must be right to pass
          double GPA = 1.8;

          if (credits >= 40 && GPA >= 2.0) {
               System.out.println("You earned diploma!");
          } else {
               System.out.println("You didn't earn diploma!");
          }
    } 

}
