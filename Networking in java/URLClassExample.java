
import java.net.*;
import java.io.*;

public class URLClassExample {

    public static void main(String[] args) throws Exception {
        URL url = new URL("https://www.example.com");
// Onle Line Reader Solution
// BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

        InputStreamReader isr = new InputStreamReader(url.openStream());
        BufferedReader br = new BufferedReader(isr);
        int i;
        while((i=br.read())!=-1){

            System.out.print((char)i);
        }
        System.out.println("Protocol : " + url.getProtocol());
        System.out.println("Port : " + url.getPort());
        System.out.println("Host : " + url.getHost());
        System.out.println("Port : " + url.getPort());
        br.close();

    }
}
