
import java.util.Scanner;

public class CategorizePersonGroup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the different group of ages");
        System.out.println("Please enter your age");
        int age = input.nextInt();

        if(age>= 13){
            System.out.println(" you are in teen group");
        }
        else if(age>= 20){
            System.out.println("you are adult");
        }else if(age>=65){
            System.out.println("you are a senior citizenship");
        }
        else {
            System.out.println("you are a child");
        }
    }

}
