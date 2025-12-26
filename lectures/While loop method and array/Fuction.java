public class Fuction {
    public static void main(String[] args) {
       /* System.out.println("in main method");
          greeting();
        System.out.println("method callling compalte");
    **/

        printFirstPattern();
        printSecondPattern();
    }
        public static void  printFirstPattern() {
           int rows =0;
           while (rows < 20){
               System.out.print("*");
               int i =0;
               while(i<rows){
                   System.out.print(" *");
                   i++;
               }
               System.out.println();
               rows++;
           }

        }
public static void printSecondPattern() {
            System.out.println("*");
            System.out.println("* *");
            System.out.println("* * *");
            System.out.println("* * * *");
            System.out.println("* * * * *");
        }

    public  static void greeting(){
        System.out.println("welcome to my class");
    }
}


