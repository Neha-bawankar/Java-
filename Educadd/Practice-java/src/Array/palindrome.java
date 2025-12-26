package Array;

public class palindrome {
    public static void main(String[] args) {
        String s = "madam";
        char[] arr = s.toCharArray();
        boolean flag  =true;

        for(int i =0; i< arr.length/2; i++){
            if(arr[i]!= arr[arr.length -1 -i]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not palindrome");
        }


    }
}
