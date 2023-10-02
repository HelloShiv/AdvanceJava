import java.sql.SQLDataException;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.ResultSet;
import java.sql.Statement;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.Buffer;

class updateRecord4 {
    public static void main(String[] args) {
        Connection con = null;
        String jdbcURL = "jdbc:mysql://localhost:3306/java";
        String username = "shiv";
        String passwd = "123";
        String resq = "select * from table1";
        String updateq = "update table1 set name=? where id=?";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(jdbcURL,username,passwd);
            System.out.println(con.isClosed()? "Connection Refused" : "Connection Made");

            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(resq);
            while(res.next()){
                System.out.println("sno: " + res.getInt("id") + " name: " +res.getString("name"));
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter the id to change: ");
            Integer id = Integer.parseInt(br.readLine());
            System.out.print("Enter the new name: ");
            String name = br.readLine();

            PreparedStatement ptmt = con.prepareStatement(updateq);
            ptmt.setString(1, name);
            ptmt.setInt(2, id);
            ptmt.executeUpdate();
            
            res = stmt.executeQuery(resq);
            while(res.next()){
                System.out.println("sno: " + res.getInt("id") + " name: " +res.getString("name"));
            }

        }catch(ClassNotFoundException | IOException | SQLException e){
            System.out.println("Error encountered: " +e);
        }
    }
}
