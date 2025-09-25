import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String[][] accounts = {
            {"jem","jem123","Biyaya404"},
            {"pochie","pochie123","MaPagMahalL_#22"},
            {"juan","juan23","Juan23FourFive"}
        };

        System.out.println("=LOGIN YOUR ACCOUNT=");
        
        System.out.print("Enter your username: ");
        String username = input.nextLine();

        System.out.print("Enter your password: ");
        String password = input.nextLine();

        boolean isAccountExist = false;

        for(int i = 0; i < accounts.length; i++){
            if(accounts[i][0].equals(username) && accounts[i][1].equals(password)){
                System.out.println("Welcome, " + accounts[i][2] + "!");
                isAccountExist = true;
                break;
            }
        }

        if(!isAccountExist){
            System.out.println("Account not found! Please try again.");
        }

        input.close();

    }

}


