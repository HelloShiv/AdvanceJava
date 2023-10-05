import java.net.InetAddress;
public class localhost {
    public static void main(String[] args) {
        try{
            InetAddress web = InetAddress.getByName("www.drcarewell.in");
            System.out.println("hostname :" + web.getHostName());
            System.out.println("hostAddress :" + web.getHostAddress());

            InetAddress local = InetAddress.getLocalHost();
            System.out.println(local.getHostName());

        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
