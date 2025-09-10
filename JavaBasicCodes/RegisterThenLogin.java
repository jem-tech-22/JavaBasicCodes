package JavaBasicCodes;
import java.util.Scanner;
// @jem-tech-22
public class RegisterThenLogin{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String[][] accounts = new String[3][3];

    System.out.println("REGISTER HERE");

    System.out.print("Username: ");
    accounts[0][0] = input.nextLine();

    System.out.print("Password: ");
    accounts[0][1] = input.nextLine();

    System.out.print("Display Name: ");
    accounts[0][2] = input.nextLine();

    System.out.println("Account created! Please proceed to Login.");

    System.out.println("");
    System.out.println("LOGIN HERE");
    
    System.out.print("Username: ");
    String username = input.nextLine();

    System.out.print("Password: ");
    String password = input.nextLine();

    for(int i = 0; i < accounts.length; i++){
      if(accounts[i][0].equals(username) && accounts[i][1].equals(password)){
        System.out.println("Welcome, " + accounts[i][2] + "!");
        break;
      } else{
        System.out.println("Wrong credentials! Please try again.");
      }
    }

    input.close();

  }
}