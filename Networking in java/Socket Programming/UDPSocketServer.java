
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.DatagramPacket;
import java.net.SocketException;


public class UDPSocketServer{
  public static void main(String[] args) throws SocketException, IOException {
    DatagramSocket socket = new DatagramSocket(9876);
    byte[] buffer = new byte[1024];

    System.out.println("Server Is Waiting For A message");
    
    DatagramPacket packet = new DatagramPacket(buffer , buffer.length);
    socket.receive(packet);

    String message = new String(packet.getData(),0,packet.getLength());
    System.out.println("Received"+message);
    socket.close();

  }
}