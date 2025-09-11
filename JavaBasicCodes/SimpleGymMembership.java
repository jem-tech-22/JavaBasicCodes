package JavaBasicCodes;
import java.util.Scanner;
// @jem-tech-22
public class SimpleGymMembership{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      final int REGULAR_FEE = 1000;
      final double STUDENT_DISCOUNT = .10;

      System.out.println("===GYM MEMBERSHIP===");
      
      System.out.print("Name: ");
      String name = input.nextLine();

      System.out.print("Are you a student? (yes/no): ");
      String askIfStudent = input.nextLine();

      boolean isStudent = askIfStudent.equalsIgnoreCase("yes");

      double totalFee = REGULAR_FEE;

      if(isStudent){
         double discount = REGULAR_FEE * STUDENT_DISCOUNT;
         totalFee -= discount;
         System.out.println("What's up, " + name + "! You got 10% discount! " + "Your total payment is P" + (totalFee));
      } else{
         System.out.println("Your total payment is P" + REGULAR_FEE);
      }

      input.close();
      
   }
}