import java.io.*;
import java.net.*;

class client{
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost" , 9999);
            System.out.println(socket.isClosed()?  "Connection is closed" : "Connected to server");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Number whoose factorial needs to be calculated: ");
            int factNo = Integer.parseInt(br.readLine());

            PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
            out.println(factNo);

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            System.out.println("Factorial of the "+ factNo +" is: "+ Integer.parseInt(in.readLine()));
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}