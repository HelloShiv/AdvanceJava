
// import java.io.IOException;
// import java.net.HttpURLConnection;
// import java.net.URL;

// public class httpurlconnection {
//     public static void main(String[] args) {
//         try {
//             // Create a URL object with the target URL
//             URL url = new URL("https://www.drcarewell.in");

//             // Open a connection to the URL
//             HttpURLConnection connection = (HttpURLConnection) url.openConnection();

//             // Set the request method to GET (default)
//             connection.setRequestMethod("GET");

//             // Get the response code from the server
//             int responseCode = connection.getResponseCode();

//             // Print the response code
//             System.out.println("Response Code: " + responseCode);

//             // Close the connection
//             connection.disconnect();
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }
// }
