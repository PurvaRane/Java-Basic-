
// PacketSentDemo.java
import java.net.*;
import java.io.*;

class PacketSentDemo {
    public static void main(String args[]) {
        int argc = args.length;
        // check for valid number of parameters
        if (argc != 1) {
            System.out.println("Syntax:");
            System.out.println("java PacketSentDemo hostname");
            return;
        }
        String hostname = args[0];
        try {
            System.out.println("Binding to a local port");
            // Create a datagram socket, bound to any available local port
            DatagramSocket dsocket = new DatagramSocket();
            System.out.println("Bound to local port " + dsocket.getLocalPort());

            // Create a message to send using a UDP socket
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            PrintStream pout = new PrintStream(bout);
            pout.print("Greetings!");

            // Get the contents of our message as an array of bytes
            byte[] barray = bout.toByteArray();
            // Create a datagram packet, containing our byte array as a payload
            DatagramPacket dpacket = new DatagramPacket(barray, barray.length);
            System.out.println("Looking up hostname " + hostname);
            // Lookup the specified hostname and get an InetAddress
            // hostname = args[1];
            // hostname = dpacket.getHostname
            InetAddress remote_addr = InetAddress.getByName(hostname);
            System.out.println("Hostname resolved as " + remote_addr.getHostAddress());
            // Set Address packet to sender

            dpacket.setAddress(remote_addr);

            // set port number to 2000
            dpacket.setPort(2000);
            // send the packet - remember no guarantee of delivery
            dsocket.send(dpacket);
            System.out.println("Packet sent!!");
        } // end of try block
        catch (UnknownHostException uhe) {
            System.err.println("Can't find host " + hostname);
        } catch (IOException t) {
            System.err.println("Error " + t);
        }
    } // end of main
} // end of class