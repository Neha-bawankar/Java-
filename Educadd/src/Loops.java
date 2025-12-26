public class Loops {
    public static void main(String[] args) {

        //int i = 1;
        //while loop
     /*  while( i <= 0){
            System.out.println( "Hello world");
            i++;
            // i = i+1   =2

        }*/
          //do- while loop
/*       do{
            System.out.println(i);
            i++;
        }while(i<=10);
*/
// for loop
   /*     for(int i = 1; i<=10; i++){
            System.out.println(7 + "x" + i +"=" + i *7);
        }*/
// for each loop(Enhance loop)
  /*     String name[] = {"ram", "shyam","amiya" };
        for( String names : name){
            System.out.println(names);
        }

*/

      // nested loop

     /*   for(int i =1; i <=6; i++){
            for(int j =1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
*/

        //break
        int i = 1;
        while(i <=10){
            if (i == 6){
                i++;
                continue;


            }

            System.out.println(i);
            i++;
        }
    }
}
