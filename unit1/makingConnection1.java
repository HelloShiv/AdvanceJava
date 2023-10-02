import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


class makingConnection1 {
    public static void main(String []args){
        String jdbcURL = "jdbc:mysql://localhost:3306/java";
        String username = "shiv";
        String passwd = "123";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(jdbcURL,username,passwd);
            if(con.isClosed()){
                System.out.println("Connection not made ...");
            } else{
                System.out.println("Connection made You are Connected ...");
            }
            

        } catch(ClassNotFoundException | SQLException e){
            System.out.println("Error encountered" + e);
        }

    }
}
