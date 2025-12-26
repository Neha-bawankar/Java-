package Array;

public class ReverseString {
    public static void main(String[] args) {
        String s= "hello";
        char[] arr = s.toCharArray();

        for (int i = arr.length -1; i >=0; i--){
            System.out.println(arr[i]);
        }
    }
}
