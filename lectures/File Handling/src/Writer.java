
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String fileName = "Java-course.text";

        try( FileWriter writer =new FileWriter(fileName)){

            writer.write("This is the best java course");
            writer.flush();
            System.out.println("File written is successfully");

        } catch(IOException exception){
            System.out.printf("exception occured %s\n", exception.getMessage());
        }

        }
    }

