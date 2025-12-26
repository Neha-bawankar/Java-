package In.Coding.equalschallenges;

public class TestArray {
    public static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations(new int[]{1, 5, 3, 9});
        ArrayOperations.Statistis statistis = arr.new Statistis();
        System.out.println(statistis.mean());
    }
}
