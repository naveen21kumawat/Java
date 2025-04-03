
import java.io.*;
import java.net.*;


public class Buf_Server {
  public static void main(String[] args) throws IOException {
    ServerSocket server = new ServerSocket(5000);
    Socket socket = server.accept(); // Accept client
    PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
    out.println("Hello, Client!"); // Send message
    socket.close();
    server.close();
}

}
