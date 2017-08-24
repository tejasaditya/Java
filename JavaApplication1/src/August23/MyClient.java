/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package August23;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author Sys
 */
public class MyClient {

    public static void main(String[] args) throws IOException
    {

        System.out.println("Client Started");
        Socket sk = new Socket("192.168.1.40", 3333);
        System.out.println("Client connected to server");
        OutputStream os = sk.getOutputStream();
        DataOutputStream dout = new DataOutputStream(os);
        String str = "Goodbye";
        dout.writeUTF(str);
        System.out.println("Data Sent");
        sk.close();
        
    }
}
//do two way