package Method;

public class methodoverloading {
    public static void main(String[] args) {

        pizza("Cheese");
        pizza("corn cheese ", "olives");



    }
    static  String pizza(String name){
        System.out.println(" I want to eat " + name + " Pizza");
        return name;
    }
    static String pizza(String name, String toppings){
        System.out.println(" I want to eat " + name + " pizza With" + toppings);
        return toppings;
    }

}
