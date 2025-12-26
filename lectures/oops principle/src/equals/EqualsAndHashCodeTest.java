package equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Shubham", 26, "001");
        Person person2 = new Person("Shubham", 26, "001");

        if(person1.equals(person2)){
            System.out.println("Equals");
        }else{
            System.out.println("Not Equals");
        }
    }
}
