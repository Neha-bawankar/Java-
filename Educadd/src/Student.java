public class Student {;
    public int roll_no;
    public String name;

    Student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }

    // passing array to method
    public static void main(String[] args){
        int arr[] = {3, 2, 45, 6, 7};


        //passing array to method
        sum(arr);
    }
    public static void sum(int[] arr){
        int sum =0;
        for (int i =0; i < arr.length; i++)
            sum +=  arr[i];

        System.out.println(sum);

    }


}
