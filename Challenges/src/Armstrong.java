import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to the Armstrong Number Series");
        System.out.println("please enter the number");
        int num = input.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if(isArmstrong){
            System.out.println("your number is Armstrong");
        }
        else{
            System.out.println("your number is  not Armstrong");
        }
    }
    public static boolean isArmstrong(int num){
        int digits = noOfDigits(num);
        int numCopy = num;
        System.out.println("no of digit");
        int finalNumber = 0;
        
        while (num>0){
            int digit = num %10;
            num/=10;
            finalNumber += Pow(digit, digits);
        }
        return finalNumber == numCopy;
    }
    public static int Pow(int num1, int num2){
        int result = 1;
        int i = 0;
        while(i <num2){
            result *= num1;
            i++;
        }

        return result;
    }
    public static int noOfDigits(int num){
        int digits = 0;
        while (num >0){
            digits++;
            num/=10;
        }
        return digits;
    }
}



