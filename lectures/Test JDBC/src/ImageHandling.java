import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ImageHandling {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "12345";
        String image_path  ="C:\\Users\\lenovo\\OneDrive\\Pictures\\Camera Roll\\990657d42281b736d6dcb839a49c9709.jpg";
        String query = " INSERT INTO image_table(image_data) VALUES(?)";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers load successfully!!!");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established successfully");
            FileInputStream fileInputStream = new FileInputStream(image_path);
            // image ka bineary data store krne ke liye
            byte[] image_data = new byte[fileInputStream.available()];
            // image data  ko read krne ke liye
            fileInputStream.read(image_data);
            PreparedStatement preparedStatement = con.prepareStatement(query);
            preparedStatement.setBytes(1, image_data);
            int affectedRows = preparedStatement.executeUpdate();
            if(affectedRows > 0){
                System.out.println("Image inserted successfully");
            }else{
                System.out.println("image not inserted");
            }


        }catch(SQLException  e){
            System.out.println(e.getMessage());
        }catch(FileNotFoundException e){
            throw  new RuntimeException(e);
        }catch(IOException e){
            throw  new RuntimeException(e);
        }

    }
}
