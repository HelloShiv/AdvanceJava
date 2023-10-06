# Java DatagramSocket and DatagramPacket

Java `DatagramSocket` and `DatagramPacket` classes are used for connection-less socket programming using the UDP (User Datagram Protocol) instead of TCP (Transmission Control Protocol).

## Datagram

Datagrams are collections of information sent from one device to another via a network. Datagram transmission does not guarantee the safe and complete arrival of data. Data may get damaged or lost during transmission. The UDP protocol is used to implement datagrams in Java.

## Java DatagramSocket Class

Java `DatagramSocket` class represents a connection-less socket for sending and receiving datagram packets. It is a mechanism used for transmitting datagram packets over a network.

### Commonly Used Constructors of DatagramSocket Class

1. `DatagramSocket() throws SocketException`: Creates a datagram socket and binds it to an available port number on the localhost machine.
2. `DatagramSocket(int port) throws SocketException`: Creates a datagram socket and binds it to the given port number.
3. `DatagramSocket(int port, InetAddress address) throws SocketException`: Creates a datagram socket and binds it to the specified port number and host address.

### Important Methods of DatagramSocket Class

- `void bind(SocketAddress addr)`: Binds the `DatagramSocket` to a specific address and port.
- `void close()`: Closes the datagram socket.
- `void connect(InetAddress address, int port)`: Connects the socket to a remote address for the socket.
- `void disconnect()`: Disconnects the socket.
- `boolean getBroadcast()`: Tests if `SO_BROADCAST` is enabled.
- `DatagramChannel getChannel()`: Returns the unique `DatagramChannel` object associated with the datagram socket.
- `InetAddress getInetAddress()`: Returns the address to which the socket is connected.
- `InetAddress getLocalAddress()`: Gets the local address to which the socket is connected.
- `int getLocalPort()`: Returns the port number on the local host to which the socket is bound.
- `SocketAddress getLocalSocketAddress()`: Returns the address of the endpoint the socket is bound to.
- `int getPort()`: Returns the port number to which the socket is connected.
- `int getReceiverBufferSize()`: Gets the value of the `SO_RCVBUF` option for this DatagramSocket, which is the buffer size used by the platform for input on the DatagramSocket.
- `boolean isClosed()`: Returns the status of the socket (closed or not).
- `boolean isConnected()`: Returns the connection state of the socket.
- `void send(DatagramPacket p)`: Sends the datagram packet from the socket.
- `void receive(DatagramPacket p)`: Receives the datagram packet from the socket.

## Java DatagramPacket Class

Java `DatagramPacket` is a message that can be sent or received. It is a data container. Multiple packets may arrive in any order, and packet delivery is not guaranteed.

### Commonly Used Constructors of DatagramPacket Class

1. `DatagramPacket(byte[] barr, int length)`: Creates a datagram packet. This constructor is used to receive packets.
2. `DatagramPacket(byte[] barr, int length, InetAddress address, int port)`: Creates a datagram packet. This constructor is used to send packets.

### Important Methods of DatagramPacket Class

1. `InetAddress getAddress()`: Returns the IP address of the machine to which the datagram is being sent or from which it was received.
2. `byte[] getData()`: Returns the data buffer.
3. `int getLength()`: Returns the length of the data to be sent or received.
4. `int getOffset()`: Returns the offset of the data to be sent or received.
5. `int getPort()`: Returns the port number on the remote host to which the datagram is being sent or from which it was received.
6. `SocketAddress getSocketAddress()`: Gets the SocketAddress (IP address + port number) of the remote host that the packet is being sent to or coming from.
7. `void setAddress(InetAddress iaddr)`: Sets the IP address of the machine to which the datagram is being sent.
8. `void setData(byte[] buff)`: Sets the data buffer for the packet.
9. `void setLength(int length)`: Sets the length of the packet.
10. `void setPort(int iport)`: Sets the port number on the remote host to which the datagram is being sent.
11. `void setSocketAddress(SocketAddress addr)`: Sets the SocketAddress (IP address + port number) of the remote host to which the datagram is being sent.

## Example of Sending DatagramPacket by DatagramSocket

Here's an example of sending a `DatagramPacket` using `DatagramSocket`:

```java
// DSender.java
import java.net.*;

public class DSender {
  public static void main(String[] args) throws Exception {
    DatagramSocket ds = new DatagramSocket();
    String str = "Welcome java";
    InetAddress ip = InetAddress.getByName("127.0.0.1");
     
    DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
    ds.send(dp);
    ds.close();
  }
}
````


````
DatagramSocket ->InetAddress_ip->DatagramPacket(data.bytes(),len,ip,port)->dsocket.send(dpacket)````