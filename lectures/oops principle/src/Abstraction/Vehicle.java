package Abstraction;

public  abstract class Vehicle implements Transport{
    private int noOfTyre;

    public Vehicle(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }

    public abstract void makeStartSound();

    @Override
    public void getSetGo() {
        System.out.println("Lets Go");
    }

    public int getNoOfTyre() {
        return noOfTyre;
    }

    public void setNoOfTyre(int noOfTyre) {
        this.noOfTyre = noOfTyre;
    }

    public void commute(){
        System.out.println("Going");
    }
}
