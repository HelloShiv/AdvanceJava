# Java `HttpURLConnection` Class

The `HttpURLConnection` class in Java is specific to HTTP protocol and is a subclass of the `URLConnection` class. It is used for performing HTTP requests and handling HTTP responses. This class allows you to retrieve information from HTTP URLs, including header information, status codes, and response data.

## `HttpURLConnection` Constructors

- `protected HttpURLConnection(URL u)`: Constructs an instance of the `HttpURLConnection` class.

## Important `HttpURLConnection` Methods

Here are some important methods provided by the `HttpURLConnection` class:

- `void disconnect()`: Indicates that other requests from the server are unlikely in the near future.
- `InputStream getErrorStream()`: Returns the error stream if the connection failed but the server sent useful data.
- `static boolean getFollowRedirects()`: Returns a boolean value to check whether or not HTTP redirects should be automatically followed.
- `String getHeaderField(int n)`: Returns the value of the nth header field.
- `long getHeaderFieldDate(String name, long Default)`: Returns the value of the named field parsed as a date.
- `String getHeaderFieldKey(int n)`: Returns the key for the nth header field.
- `boolean getInstanceFollowRedirects()`: Returns the value of the `HttpURLConnection` instance's `FollowRedirects` field.
- `Permission getPermission()`: Returns the `SocketPermission` object representing the permission to connect to the destination host and port.
- `String getRequestMethod()`: Gets the request method.
- `int getResponseCode()`: Gets the response code from an HTTP response message.
- `String getResponseMessage()`: Gets the response message sent along with the response code from a server.
- `void setChunkedStreamingMode(int chunklen)`: Enables streaming of an HTTP request body without internal buffering when the content length is not known in advance.
- `void setFixedLengthStreamingMode(int contentlength)`: Enables streaming of an HTTP request body without internal buffering when the content length is known in advance.
- `void setFixedLengthStreamingMode(long contentlength)`: Enables streaming of an HTTP request body without internal buffering when the content length is not known in advance.
- `static void setFollowRedirects(boolean set)`: Sets whether HTTP redirects (requests with response codes) should be automatically followed by the `HttpURLConnection` class.
- `void setInstanceFollowRedirects(boolean followRedirects)`: Sets whether HTTP redirects (requests with response codes) should be automatically followed by an instance of the `HttpURLConnection` class.
- `void setRequestMethod(String method)`: Sets the method for the URL request (e.g., GET, POST, HEAD, etc.).
- `abstract boolean usingProxy()`: Indicates if the connection is going through a proxy.

## How to Get an `HttpURLConnection` Object

To obtain an instance of the `HttpURLConnection` class, you can use the `openConnection()` method of the `URL` class and typecast it to `HttpURLConnection`. Here's an example:

```java
URL url = new URL("http://www.javatpoint.com/java-tutorial");
HttpURLConnection huc = (HttpURLConnection) url.openConnection();
