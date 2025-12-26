public class Operator {
    public static void main(String[] args) {
        //Arithimatic Operator
        //user input
    /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter you first value");
        int a  = sc.nextInt();
        System.out.println("Enter you second values");
        int b =sc.nextInt() ;
        int sum = a +b;
        System.out.println("Sum of both value: "+ sum);
*/

/*
        //Addition
        System.out.println("Addition of a and b :"+ ( a+b));
        //Substraction
        System.out.println("substraction of a and b :"+ ( a-b));
        //multiplication
        System.out.println("multi of a and b :"+ ( a*b));
        //division
        System.out.println("division of a and b :"+ ( a/b));
        //Modulus
        System.out.println("Modulus of a and b :"+ ( a%b));
        //increase
        System.out.println("increase of a and b :"+ ( ++a));
        //decrease
        System.out.println("decrease of a and b :"+ ( --a));

*/
        //Assignment operator
     /*  int x = 5;
        System.out.println(x = 5);
        // +=
        System.out.println(x += 7);
        //-=
        System.out.println(x -= 3);
        // *=
        System.out.println(x *= 10);
        // /=
        System.out.println(x /= 9);
        // %=
        System.out.println(x %= 2);

        //&=
        System.out.println(x &= 2);
        // |=
        System.out.println(x |= 3);
        // ^=
        System.out.println(x ^= 5);
        // >>=
        System.out.println(x >>= 9);
        // <<=
        System.out.println(x <<= 9);

*/
  /*      //Comparision operator
       int a  =30;
        int b = 30;

        // ==
        System.out.println( a == b);
        // !=
        System.out.println(a != b);
        // >
        System.out.println(a > b);
         // <
        System.out.println(a <b);
        // >=
        System.out.println(a >= b);
        // <=
        System.out.println( a <= b);

*/
  //Logical operator
       boolean isLoggedIn = true;
        boolean isAdmin = false;

        System.out.println("Regular user: " + (isLoggedIn && isAdmin));
        System.out.println("Has access: " + (isLoggedIn || isAdmin));
       System.out.println("Not logged in: " + (!isLoggedIn));

       //precendence


    }

}