import java.util.Scanner;

public class SearchArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to finding the maximum");
        int arr[] = ArrayUtility.inputArray();


        int max = Integer.MIN_VALUE;

        for(int num: arr){
            if(max < num){
                max = num;
            }

        }
        System.out.println("Maximum number is : " + max);
    }
}
