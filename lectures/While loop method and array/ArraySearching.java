import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 65, 79, 89, 45, 98, 9, 87,};
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to array searching\n");
        System.out.println("Enter the number you want to search");

        int num =input.nextInt();
        boolean isFound = isFound(arr, num);
        if(isFound){
            System.out.println("your number is found in the array");
        }
        else{
            System.out.println("your number is not found in the array");
        }
    }
    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while(index<arr.length){
            if(arr[index] ==num){
                return true;
            }
            index++;
        }
        return false;
    }
}
