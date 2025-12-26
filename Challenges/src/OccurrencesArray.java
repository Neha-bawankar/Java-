import java.util.Scanner;

public class OccurrencesArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array  Occurrences");
        Scanner input = new Scanner(System.in);
        int[] numArray = ArrayUtility.inputArray();
        int num = input.nextInt();
        int occurrences = noOfOccurrences(numArray,num);
        System.out.println("your elemnets was found" + occurrences + "time in the array ");

    }
    public static int noOfOccurrences(int[] numArr,int num){
        int occ = 0;
        int i = 0;
        while(i< numArr.length){
            if(numArr[i] == num){
                occ++;
            }
            i++;
        }
    return 0;
}
}