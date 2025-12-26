
public class NeedOfMultiThreading {
    public static void main(String[] args) {
         //First Task
        for(int i =0; i<=1000; i++){
            System.out.printf("%d* ", i);
        }
        System.out.println("\n first task complete");



        //second Task
        for(int i =0; i<=1000; i++){
            System.out.printf("%d# ", i);
        }
        System.out.println("\n second task complete");



        //Third Task
        for(int i =0; i<=1000; i++){
            System.out.printf("%d@ ", i);
        }
        System.out.println("\n third task complete");


    }
}