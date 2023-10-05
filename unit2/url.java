import java.net.*;
class url{
    public static void main(String[] args) {
    try{    

        URL url = new URL("https://www.drcarewell.in/");
        System.out.println("protocol: " +url.getProtocol());
        System.out.println("Host Name: " + url.getHost());
        System.out.println("Por NUmber: " + url.getPort());
        System.out.println("File name: " + url.getFile());
        System.out.println("Authority: " + url.getAuthority());
        
    } catch (Exception e){
        e.printStackTrace();
    }

    }
}