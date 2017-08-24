/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package August23;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

    public static void main(String[] args) throws IOException
    {

        System.out.println("Server started");
        while(true)
        {
        ServerSocket ss = new ServerSocket(3333);
        
            Socket sk = ss.accept();
        
        System.out.println("Client Connected");
       /* InputStream is = sk.getInputStream();
        int x;
        while((x = is.read()) != -1)
        {
            System.out.print((char)x);
        }
        sk.close();*/
        DataInputStream dis = new DataInputStream(sk.getInputStream());
        String str = dis.readUTF();
        System.out.println("Client says:"+str);
        sk.close();
        ss.close();
        }
        
    }
}
//do two way