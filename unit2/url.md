# Java URL Class

The Java URL class represents a Uniform Resource Locator (URL). It points to a resource on the World Wide Web. For example:


## URL in Java

A URL contains many pieces of information:

- **Protocol:** In this case, http is the protocol.
- **Server name or IP Address:** In this case, www.javatpoint.com is the server name.
- **Port Number:** It is an optional attribute. If we write `http://www.kjkk.com:80/sonoojaiswal/`, 80 is the port number. If the port number is not mentioned in the URL, it returns -1.
- **File Name or Directory Name:** In this case, index.jsp is the file name.

## Constructors of Java URL class

- `URL(String spec)`: Creates an instance of a URL from the String representation.
- `URL(String protocol, String host, int port, String file)`: Creates an instance of a URL from the given protocol, host, port number, and file.
- `URL(String protocol, String host, int port, String file, URLStreamHandler handler)`: Creates an instance of a URL from the given protocol, host, port number, file, and handler.
- `URL(String protocol, String host, String file)`: Creates an instance of a URL from the given protocol name, host name, and file name.
- `URL(URL context, String spec)`: Creates an instance of a URL by parsing the given spec within a specified context.
- `URL(URL context, String spec, URLStreamHandler handler)`: Creates an instance of a URL by parsing the given spec with the specified handler within a given context.

## Commonly used methods of Java URL class

The `java.net.URL` class provides many methods. The important methods of the URL class are:

- `getProtocol()`: Returns the protocol of the URL.
- `getHost()`: Returns the host name of the URL.
- `getPort()`: Returns the Port Number of the URL.
- `getFile()`: Returns the file name of the URL.
- `getAuthority()`: Returns the authority of the URL.
- `toString()`: Returns the string representation of the URL.
- `getQuery()`: Returns the query string of the URL.
- `getDefaultPort()`: Returns the default port of the URL.
- `openConnection()`: Returns the instance of URLConnection associated with this URL.
- `equals(Object obj)`: Compares the URL with the given object.
- `getContent()`: Returns the content of the URL.
- `getRef()`: Returns the anchor or reference of the URL.
- `toURI()`: Returns a URI of the URL.

## Example of Java URL class

```java
// URLDemo.java
import java.net.*;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.gh.com/java-tutorial");

            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host Name: " + url.getHost());
            System.out.println("Port Number: " + url.getPort());
            System.out.println("File Name: " + url.getFile());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
