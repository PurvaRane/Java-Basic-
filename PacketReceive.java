
// PacketReceive.java
import java.net.*;
import java.io.*;

public class PacketReceive {
    public static void main(String args[]) {
        try {
            System.out.println("Binding to local port 2000");
            // Create a datagram socket, bound to the specific port 2000
            DatagramSocket dsocket = new DatagramSocket(2000);
            System.out.println("Bound to local port " + dsocket.getLocalPort());
            // Create a datagram packet, containing a max buffer of 256 bytes
            DatagramPacket dpacket = new DatagramPacket(new byte[256], 256);
            // Receive a packet - remeber by default this is a blocking operation
            dsocket.receive(dpacket);
            System.out.println("packet received");
            // Display packet information
            InetAddress remote_addr = dpacket.getAddress();
            System.out.println("Sent by: " + remote_addr.getHostAddress());
            System.out.println("Sent from: " + dpacket.getPort());
            // Display packet contents by reading from byte array
            ByteArrayInputStream bin = new ByteArrayInputStream(dpacket.getData());
            // Display only upto the length of the original UDP packet
            for (int i = 0; i < dpacket.getLength(); i++) {
                int data = bin.read();
                if (data == -1)
                    break;
                else
                    System.out.print((char) data);
            }
            dsocket.close();
        } catch (IOException t) {
            System.err.println("Error " +
                    t);
        }
    } // end of main
} // end of class