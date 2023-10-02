import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Statement;
import java.sql.ResultSet;

class insertIntoTableUserValues4 {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/java";
        String username = "shiv";
        String passwd = "123";
        String q = "insert into table1 (name) values(?)";
        String resq = "select * from table1";
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(jdbcURL,username,passwd);
            System.out.println(con.isClosed()?"Connection Refused.." : "Connection Made ....");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter name :");
            String name = br.readLine();

            PreparedStatement ptmt = con.prepareStatement(q);
            ptmt.setString(1,name);
            ptmt.executeUpdate();

            System.out.println("Added the value to db.. ");


            Statement stmt = con.createStatement();
            ResultSet res = stmt.executeQuery(resq);
            while(res.next()){
                System.out.println("sno: " + res.getInt("id") + " name: " + res.getString("name"));
            }
            con.close();


        }catch(ClassNotFoundException | IOException |SQLException e){
            System.out.println("Error encountered.. "+ e);
        }
        
    }
}
