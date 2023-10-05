import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;

public class time {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://example.com/path/to/your/file.txt"); // Replace with the actual URL of the file

            // Open a connection to the URL
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Set the request method to HEAD to retrieve only headers
            connection.setRequestMethod("HEAD");

            // Get the last modified timestamp of the file from the response headers
            long lastModified = connection.getLastModified();

            if (lastModified != 0) {
                Date lastModifiedDate = new Date(lastModified);
                System.out.println("Last Modified Date: " + lastModifiedDate);

                // You can compare lastModified with a previously stored timestamp to check for modifications
                // For example:
                // long storedTimestamp = ... // Get the previously stored timestamp
                // if (lastModified > storedTimestamp) {
                //     System.out.println("The file has been modified.");
                // } else {
                //     System.out.println("The file has not been modified.");
                // }
            } else {
                System.out.println("Last Modified date not available.");
            }

            // Close the connection
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
