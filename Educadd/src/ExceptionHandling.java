public class ExceptionHandling {
    private static boolean[] arr;

    public static void main(String[] args) {

       //int arr[] = {2, 3, 4,0};
       // int a = 10;

/*
        try{
            System.out.println(a/0);
            System.out.println(arr[5]);
        }catch( ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I am always executed");
        }
        System.out.println("Bye");
        
*/
        try {
            arry(10);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static int arry(int i) throws Exception  {
        System.out.println(arr[0]);
        return arry(0);
    }

  
    
    
    
    
}
