import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

class datagram{
    public static void main(String[] args) {
        try {
            String str = "hello there";
            DatagramSocket datagramSocket = new DatagramSocket();
            InetAddress ip = InetAddress.getLocalHost();
            DatagramPacket datagramPacket = new DatagramPacket
            (str.getBytes(), str.length(),ip , 4333);
            datagramSocket.send(datagramPacket);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}