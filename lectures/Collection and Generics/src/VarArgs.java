public class VarArgs {
    public static void main(String[] args) {
        System.out.println(sum(4,0));
        //System.out.println(sum(new int[]{4, 5}));

        System.out.println(sum(4,6,3,7,1,4));
    }


    // with variable argument method

    public static int sum(int... a){
        int sum =0;
        for(int i: a){
            sum+= i;
        }
        return sum;
    }

    //normal aaray method
    /*public static int sum(int[] a){
        int sum =0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }**/
    public static int sum(int a, int b){
        return a +b;
    }
}
