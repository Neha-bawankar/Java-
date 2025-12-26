public class VariableArgumentChallenges {


    public static void main(String[] args) {
        System.out.println(concatenate("Neha"));
        System.out.println(concatenate("Neha", "Bawankar"));
        System.out.println(concatenate("neha"));
    }
    public static String concatenate(String... strs) {
        StringBuilder sb = new StringBuilder();
        for(String str: strs){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }

}
