public class Array {
    public static void main(String[] args) {
        /*int[] myArr = {98, 2, 5, 8, 67, 37 };
        /*myArr[0] = 100;
        myArr[1]= 101;
        myArr[2]=102;
        myArr[3] = 103;
        myArr [4] = 104;
        System.out.println(myArr[4]);
        System.out.println(myArr[1]);
        System.out.println(myArr[0]);
        System.out.println(myArr[3]);
        System.out.println(myArr[2]);

//// Array Traversal
        int index = 0;
        while (index < myArr.length){
            System.out.println(myArr[index]);
            index++;

        }*/



        ///2d array otr the multidimensional array implemetation
        int[][] myArr = new int[2][3];
        myArr[0][0]=9;

        int[][] arr = {{1,5, 8,9},{1, 4, 4, 5}};
        System.out.println(arr[1].length);

        int i = 0;
        while(i < arr.length){
            int j =0;
            while(j<arr[i].length){
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
