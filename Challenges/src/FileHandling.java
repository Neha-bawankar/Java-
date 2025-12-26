import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the name of the file you want ot read");
        String fileName = input.next();

        try(FileReader reader  = new FileReader(fileName)){
            int read ;
           while((read = reader.read()) != -1){
               System.out.print((char) read);
           }

        }catch(IOException e){
            System.out.printf("Execution occured %s", e.getMessage());
        }
    }
}
