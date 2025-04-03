
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) throws Exception {
      System.err.println("Waiting From Client");
        ServerSocket serSocket = new ServerSocket(3333);
        Socket sock = serSocket.accept();
        InputStream in = sock.getInputStream();
        OutputStream out = sock.getOutputStream();
        byte buffer[] = new byte[1024];
        in.read(buffer);
        System.out.println("Received from client :" + new String(buffer).trim());
        out.write("Hello From Server".getBytes());
        sock.close();
        serSocket.close();

    }

}
