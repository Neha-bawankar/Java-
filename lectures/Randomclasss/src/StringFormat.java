public class StringFormat {
    public static void main(String[] args) {
        String name = "Sandeep";
        int marks = 45;
        System.out.println("Hello " + name +" your marks are :" + 45); /// beacuse of that the menory is wasting for that
        //we are using the prinf method
        System.out.printf("Hello %s, your marks are: %d ", name, marks);
    }
}
