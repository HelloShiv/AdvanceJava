import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;

class insertIntoTable3 {
    public static void main(String []args){
        String jdbcURL = "jdbc:mysql://localhost:3306/java";
        String username = "shiv";
        String passwd = "123";
        String q = "insert into table1 (name) values(?)";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(jdbcURL,username,passwd);

            System.out.println(con.isClosed()? "Connection Refused" : "Connection made ..");

            PreparedStatement ptmt = con.prepareStatement(q);
            ptmt.setString(1,"Hello there");
            ptmt.executeUpdate();

            System.out.println("Query Executed");

            
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error encountered" + e);
        }

    }
}
