//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        String url ="jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "12345";
        // execute query
       /* String query = "Select * from employees;";*/
        // insert query
        /* String query = "INSERT INTO employees(id, name, job_title, salary) VALUES (5,'Ankit', 'React Developer', 55000.00);";*/
        //delete query
       /* String query = "DELETE FROM employees where id = 3;";*/
       // update query
       String query = "UPDATE employees\n" +
               "SET job_title  = 'Compositor', salary = 100000.0\n" +
               "WHERE id =4;";




      try{
          Class.forName("com.mysql.jdbc.Driver");
          System.out.println("Driver loaded successfully");
      }catch(ClassNotFoundException e){
          System.out.println(e.getMessage());
      }

      try{
       Connection con = DriverManager.getConnection(url, username, password);
          System.out.println("Connection establish successfully");
          Statement stmt = con.createStatement();
          // execute query
          /* ResultSet rs = stmt.executeQuery(query);
           while(rs.next()){
               int id = rs.getInt("id");
               String name = rs.getString("name");
               String job_title = rs.getString("job_title");
               double salary = rs.getDouble("salary");
               System.out.println();
               System.out.println("=================");
               System.out.println("ID: " + id);
               System.out.println("Name: " + name);
               System.out.println("Job Title: " + job_title);
               System.out.println("Salary: " + salary);
           }*/

          // update query
         /* int rowsaffected = stmt.executeUpdate(query);

          if(rowsaffected >0){
              System.out.println("Insert Successfully " + rowsaffected + "row(s) affected");
          }else{
              System.out.println("insertion failed");
          }*/

          //Delete query
      /*    int rowsaffected = stmt.executeUpdate(query);

          if(rowsaffected >0){
              System.out.println("Deletion Successfully " + rowsaffected + "row(s) affected");
          }else{
              System.out.println("Deletion failed");
          }*/

          //update query
          int rowsaffected = stmt.executeUpdate(query);

          if(rowsaffected >0){
              System.out.println("Updation Successuly Successfully " + rowsaffected + "row(s) affected");
          }else{
              System.out.println("Updation failed");
          }


           stmt.close();
           con.close();
          System.out.println("connection closed successfully");

      }catch(SQLException e){
          System.out.println(e.getMessage());
      }
    }
}