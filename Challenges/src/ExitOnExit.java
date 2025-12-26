import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the Exit on Exit ");
        while(true){
            System.out.println("Enter your command");
            String command = input.next();
            if(command.equals("exit")){
                break;
            }
        }
        System.out.println("You have Successfully exited");
    }
}
