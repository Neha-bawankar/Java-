import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class PreparedState {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "12345";

        String query = "INSERT INTO employees(id, name, job_title, salary) VALUES(?, ?, ?, ?)";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers load successfully!!!");
        }catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("connection established successfully");
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter id:");
            int id  = scanner.nextInt();
             scanner.nextLine();
            System.out.print("Enter Name: ");
             String name = scanner.nextLine();
            System.out.print("Enter Job Title: ");
             String job_title = scanner.nextLine();
            System.out.print("Enter Salary: ");
             Double salary = scanner.nextDouble();


           PreparedStatement preparedStatement = con.prepareStatement(query);
             preparedStatement.setInt(1, id);
             preparedStatement.setString(2, name);
             preparedStatement.setString(3, job_title);
             preparedStatement.setDouble(4, salary);

             int rowsAffected = preparedStatement.executeUpdate();
             if(rowsAffected >0){
                 System.out.println("Data inserted successfully");
             }else{
                 System.out.println("Data insertion failed");
             }

             preparedStatement.close();
             con.close();
            System.out.println();
            System.out.println("connection closed successfully");

        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
