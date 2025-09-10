package JavaBasicCodes;
import java.util.Scanner;
// @jem-tech-22
public class EvenOrOddNumber{
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = input.nextInt();

    if(number % 2 == 0){
    System.out.println(number + " is Even number");
    } else{
    System.out.println(number + " is Odd number");
    }
    
    input.close();

  }
}