
import java.io.*;
import java.net.*;


public class Buf_Client {
  public static void main(String[] args) throws IOException {
    Socket socket = new Socket("localhost", 5000); // Connect to server
    BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    System.out.println(in.readLine()); // Read server message
    socket.close();
}

}
