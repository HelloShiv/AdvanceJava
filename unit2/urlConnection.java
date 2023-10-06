import java.net.URL;
import java.net.URLConnection;

public class urlConnection {
    public static void main(String[] args) throws Exception {
        URL url = new URL("https://example.com/path/to/your/file.txt");
        URLConnection connection = url.openConnection();
        long lastModified = connection.getLastModified();
        System.out.println(connection.getDate());
        
    }
}
