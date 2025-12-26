import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome tho exception handling challenges");
        System.out.println("Enter first number");
        int firstNumber = input.nextInt();
        System.out.println("ENTER THE SEcond number");

        int secondNumber = input.nextInt();


        try{
            int result = firstNumber/secondNumber;
            System.out.printf("Result is %d ", result);
        }catch(ArithmeticException exception){
            if(exception.getMessage().equals("/by zero")){
                System.out.println("Divide by zero occured");
            }else{
                throw exception;
            }
        }
    }
}
