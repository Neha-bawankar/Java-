import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class banking {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.getDefault());
        //declare varibale
        double balance = 0.0;
        boolean running = true;
        System.out.println("Welcome to the simple Java Banking Program!");


        //get and process user choice

        while (running) {
            displayMenu();
            int choice = getUserChoice(sc);

            switch (choice) {
                case 1:
                    showBalance(balance, currency);
                    break;
                case 2:
                    balance = deposit(sc, balance, currency);
                    break;
                case  3:
                    balance =withdraw(sc, balance, currency);
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you visit again");
                    break;
                default:
                    System.out.println("Invalid choice: please enter a valid number");
            }
        }


    }
    //display menu
      private static void displayMenu(){
          System.out.println("\nPlease choose an option: ");
          System.out.println("1. Show balance");
          System.out.println("2. Deposit");
          System.out.println("3. Withdraw");
          System.out.println("4. Exit");
          System.out.println("Enter your choice: ");
      }

      //reads the menu choice from the user
      private  static int getUserChoice(Scanner sc){
        String line = sc.nextLine().trim();
        try{
            return Integer.parseInt(line);

        }catch (NumberFormatException e){
            return -1;
        }
      }

        //show balance

      private static void showBalance(double balance, NumberFormat currency){
          System.out.println("Current balance: "+ currency.format(balance));
      }
        //deposit balance

      private static double deposit(Scanner sc, double balance, NumberFormat currency){
        Double amount = promptPositiveAmount(sc, "Enter deposit amount: ");
        if(amount == null){
            System.out.println("Deposit cancelled");
            return balance;
        }
        balance +=amount;
          System.out.println("Depostied " + currency.format(amount)+ ".New balance " + currency.format(balance));
          return  balance;
      }

      //withdraw balance
    private  static double withdraw(Scanner sc , double balance, NumberFormat currency){
        Double amount = promptPositiveAmount(sc, "Enter withdrawal amount: ");
        if(amount == null){
            System.out.println("Withdrawal cancelled");
        }
        if(amount >balance){
            System.out.println("Insufficient balance . current balance: "+ currency.format(balance));
            return  balance;
        }
        balance -= amount;
        System.out.println("Withdraw " + currency.format(amount) );
        return  balance;
    }

    private static Double promptPositiveAmount(Scanner sc, String prompt) {
        System.out.println(prompt);
        String line = sc.nextLine().trim();
        try {
            double value = Double.parseDouble(line);
            if (value <= 0) {
                System.out.println("Amount must be positive");
                return null;
            }
            return value;

        } catch (NumberFormatException e) {
            System.out.println("Invalid amount, Please enter a numeric value");
            return null;
        }

    }

}
