import java.io.*;
import java.net.*;

class server{

    static int fact(int n){
        if(n <= 0)
            return 1;
        return n * fact(n-1);
    }

    public static void main(String[] args) {
        try {
            ServerSocket serversocket = new ServerSocket(9999);
            Socket socket = serversocket.accept();
            System.out.println(socket.isClosed() ? "Connection failed !!!" : "Connection with client made");
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            
            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            int res = fact(Integer.parseInt(br.readLine()));
            System.out.println("Calculated on server : " +res);
            out.println(res);

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}