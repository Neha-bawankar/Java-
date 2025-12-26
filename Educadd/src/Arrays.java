import java.sql.SQLOutput;

public class Arrays {
    public static void main(String[] args) {
        // Array - it is a object in java , It is collection of a multiple data.
        //declaring array
         /*int[] arr;
           int arr1[];*/


        //instantialte array
      /*  int[] arr = new int[10];


        for(int i =0; i <arr.length; i++){
            System.out.println(arr[i]);
        }
*/
/*




        //assign value in array
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 34;
        arr[3] = 15;
        arr[4] = 87;

        for(int i =0; i <arr.length; i++){
            System.out.println(arr[i]);
        }



        // for each loop
        for( int i: arr){
            System.out.println(i);
        }



//ex -1 search and element in array
        int arr1[] = {1, 4, 2, 55, 67, -1};
        for(int i: arr1){
            if(i ==15){
                System.out.println("Found");
            }
            else{
                System.out.println("Not found");
            }
        }
   //EX -2 FIND MAXIMUM ARRay
        int arr2[] = {1, -43, 23, 6775, 76, 89, 89};
        int res  = Integer.MIN_VALUE;


        for (int i =0; i< arr2.length; i++){
            if(arr2[i] > res){
                res = arr2[i];
            }
            System.out.println(res);
        }


    // ex-3 reverse print array
        int arr3[] = { 1, 2, 3, 4, 5, 6, 7, 8,9, };
        for(int i = arr3.length -1; i >= 0;  i--) {
            System.out.print(arr3[i] +  " ");
        }
        System.out.println("   ");
        // ex -4 sum of array


        // two dimesional array
        int [][] arr4 = new int[3][3];
         int [][] nums = {
                 {1, 2, 3},
                 {4, 5, 6},
                 {7, 8, 9}
         };
         for(int i =0; i< nums.length; i++){
             for (int j =0; j< nums.length; j++){
                 System.out.print(nums[i][j] + " ");
             }

             System.out.println(" ");
         }



        //array of object

        //declaring  an array of student
        Student[] arr5;


         //allocating memory for  5 student
         arr5 =  new Student[5];
         arr5[0] =new Student(1, "Ram");
        arr5[1] =new Student(2, "Raman");
        arr5[2] =new Student(3, "Raj");
        arr5[3] =new Student(4, "heena");
        arr5[4] =new Student(5, "hema");

        for (int i=0; i < arr.length; i++){
            System.out.println("Student roll no is: " + arr5[i].roll_no +"  " + "student name: " + arr5[i].name);
        }




*/



        //returning array from method

        int arr[] = m1();

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + ' ');
        }

    }

    public static int[] m1() {
        return new int[] {7,8,9};
    }
}
