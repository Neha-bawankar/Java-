package OOPS.encapsulationandpackages.Encapsulation;

public class encapsul {

    private int id;

 // setter

    public void setId(int id) {
        this.id = id;
    }
// getter
    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        encapsul en  = new encapsul();
        en.setId(101);
        System.out.println(en.getId());
    }
}
