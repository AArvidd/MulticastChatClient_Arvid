import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int portNumber = 5000;
        if(args.length >= 1){
            portNumber = Integer.parseInt(args[0]);
        }

        MulticastSocket chatMulticastSocket = new MulticastSocket(portNumber);

        InetAddress group = InetAddress.getByName("255.4.5.6");

        chatMulticastSocket.joinGroup(group);

        String mgs = "";
        System.out.print("Type a message for the server: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        mgs = br.readLine();

        DatagramPacket data = new DatagramPacket(mgs.getBytes(), 0, mgs.length(), group, portNumber);
        chatMulticastSocket.send(data);

        chatMulticastSocket.close();

    }
}