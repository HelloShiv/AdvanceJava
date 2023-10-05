import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
class httpurlconnection{
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.drcarewell.in");
            HttpURLConnection hcon = (HttpURLConnection)url.openConnection();
            hcon.setRequestMethod("GET");

            System.out.println(hcon.getResponseCode());
            hcon.disconnect();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
