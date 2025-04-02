
import java.io.*;
import java.net.*;

public class URLCOnnectionClass {

    public static void main(String[] args) throws IOException {
        try {
            URL url = new URL("https://www.example.com");
            URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();
            int i;
            while((i=stream.read())!=-1){
              System.out.print((char)i);
            }

            // BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            // System.out.println(br.readLine().toString());
           

        } catch (MalformedURLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
