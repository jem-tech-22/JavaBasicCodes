package JavaBasicCodes;
import java.util.Scanner;
// @jem-tech-22
public class PalindromeChecker {
   public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);

      System.out.println("PALINDROME CHECKER");
      System.out.print("Type a word: ");
      String word = input.nextLine();

      String lowerCase = word.toLowerCase();

      // This method is way cleaner @jem-tech-22
      // String reversedWord = new StringBuilder(lowerCase).reverse().toString();

      String reversedWord = "";
      for(int i = lowerCase.length() -1; i >= 0; i--){
         reversedWord += lowerCase.charAt(i);
      }

      if(word.equals(reversedWord)){
         System.out.println(word + " is a Palindrome.");
      } else{
         System.out.println(word + " is not a Palindrome.");
      }

      input.close();

   }
}
