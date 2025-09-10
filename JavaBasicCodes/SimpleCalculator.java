package JavaBasicCodes;
import java.util.Scanner;
// @jem-tech-22
public class SimpleCalculator{
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      double firstNum, secondNum;
      char operator;

      System.out.println("Hey Friend! I'm a Simple Calculator!");

      System.out.print("Enter first number: ");
      firstNum = input.nextDouble();
      
      System.out.print("Enter second number: ");
      secondNum = input.nextDouble();

      System.out.print("Enter an operator (+, -, *, /): ");
      operator = input.next().charAt(0);

      double sum = firstNum+secondNum;
      double difference = firstNum-secondNum;
      double product = firstNum*secondNum;
      double quotient = firstNum/secondNum;

      for(int i = 0; i < 1; i++){
         if(operator == '+'){
            System.out.println("Result: " + sum);
         } else if(operator == '-'){
            System.out.println("Result: " + difference);
         } else if(operator == '*'){
            System.out.println("Result: " + product);
         } else if(operator == '/'){
            if (secondNum != 0) {
               System.out.println("Result: " + quotient);
            } else {
               System.out.println("Error! Cannot divide by zero!");
            }
         } else{
            System.out.println("Opss.. Invalid operator... Please use (+, -, *, /)");
         }
      }

      input.close();

   }
}