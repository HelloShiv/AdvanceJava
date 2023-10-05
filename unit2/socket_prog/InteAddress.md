# Java InetAddress Class

The `java.net.InetAddress` class in Java represents an IP address. It provides methods to work with IP addresses and hostnames.

## IP Address

An IP address is a numerical representation used to identify resources on a network. There are two versions of IP addresses:

1. **IPv4 (Internet Protocol version 4)**:
   - 32-bit addressing scheme.
   - Supports more than 4 million addresses.
   - Widely used for device addressing.

2. **IPv6 (Internet Protocol version 6)**:
   - 128-bit address space.
   - Provides a vast number of unique IP addresses.
   - Aimed at solving IPv4 limitations.

## TCP/IP Protocol

- TCP/IP is a communication protocol model used for network communication.
- It handles addressing, transmission, routing, and receiving data packets over the internet.
- Main protocols in TCP/IP: TCP (Transmission Control Protocol) and IP (Internet Protocol).

## Java InetAddress Class Methods

Here are some important methods of the `InetAddress` class:

- `getByName(String host)`: Returns an `InetAddress` instance for a given host name.
- `getLocalHost()`: Returns the `InetAddress` instance representing the local host.
- `getHostName()`: Returns the host name of the IP address.
- `getHostAddress()`: Returns the IP address in string format.

## Example of Java InetAddress Class

Here's a Java code example that demonstrates the usage of the `InetAddress` class to get the IP address of a website:

```java
import java.net.*;

public class InetDemo {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.drcarewell.com");
            System.out.println("Host Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
