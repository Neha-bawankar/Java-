import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to odd even calculator");
        System.out.println("Please enter your number");
        int num  = input.nextInt();

        if(num  % 2 ==0){
            System.out.println("Your number is even");
        }else{
            System.out.println("Your number is odd");
        }

    }
}
