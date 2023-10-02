import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class createTable2 {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/java";
        String username = "shiv";
        String passwd = "123";
        String q = "create table table1 (id int primary key AUTO_INCREMENT , name char(20))";

        try{    
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(jdbcURL,username,passwd);

            if(con.isClosed()){
                System.out.println("Connection refused ..");
            } else{
                System.out.println("Your are Connected..");
            }

            Statement stmt = con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table created");

        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Connection not made" + e);
        }
    }
}
