
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");

            String message = "Hello, UDP Server!";
            byte[] buffer = message.getBytes();

            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, serverAddress, 9876);
            socket.send(packet); // Send data to the server

            System.out.println("Message sent to server: " + message);

            socket.close(); // Close the socket
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
