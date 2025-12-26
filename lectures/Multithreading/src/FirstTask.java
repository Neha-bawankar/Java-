public class FirstTask extends Thread{
    @Override
    public void run() {
        for(int i =0; i<=1000; i++){
            System.out.printf("%d* ", i);
        }
        System.out.println("\n first task complete");
    }
}
