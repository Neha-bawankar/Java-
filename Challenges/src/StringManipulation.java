public class StringManipulation {
    public static void main(String[] args) {
        String firstName = "Neha";
        String lastName = "Bawankar";
        //String fullname = firstName +  " " + lastName;

        String fullname = firstName.concat((" "). concat(lastName));
        System.out.println(fullname);
        System.out.println(fullname.toUpperCase());



    }
}
