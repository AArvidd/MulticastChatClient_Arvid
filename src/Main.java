import java.net.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        int portNumber = 5000;
        if(args.length >= 1){
            portNumber = Integer.parseInt(args[0]);
        }

        MulticastSocket chatMulticastSocket = new MulticastSocket(portNumber);

    }
}