
package August23;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URL_Test {

    public static void main(String[] args) throws Exception
    {
        URL url = new URL("https://www.google.co.in/?gws_rd=ssl");
        System.out.println("Protocol: "+url.getProtocol());
        System.out.println("Host name "+url.getHost());
        System.out.println("File name:"+url.getFile());
        
        URLConnection con = url.openConnection();
        InputStream is = con.getInputStream();
        FileOutputStream fout = new FileOutputStream("google.html");
        int x;
        while((x = is.read()) != -1)
        {
            fout.write(x);
        }
        System.out.println("Done");
       
        
    }
}
