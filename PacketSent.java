
/* Name : Harshal Sagar More
 * Roll No : 2201845
 * PRN no. 2030408245006
 * Title : Implementing Client-Server using UDP
*/
import java.net.*;
import java.util.Scanner;
import java.io.*;

class PacketSent {
    public static void main(String args[]) {
        int argc = args.length;
        if (argc != 1) {
            System.out.println("Syntax:");
            System.out.println("java PacketSentDemo hostname");
            return;
        }
        String hostname = args[0];
        String input = " ";
        try {
            System.out.println("Binding to a local port");

            DatagramSocket dsocket = new DatagramSocket();
            System.out.println("Bound to local port " + dsocket.getLocalPort());

            Scanner sc = new Scanner(System.in);
            input = sc.nextLine();

            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            PrintStream pout = new PrintStream(bout);
            pout.print(input);

            byte[] barray = bout.toByteArray();

            DatagramPacket dpacket = new DatagramPacket(barray, barray.length);
            System.out.println("Looking up hostname " + hostname);

            InetAddress remote_addr = InetAddress.getByName(hostname);
            System.out.println("Hostname resolved as " + remote_addr.getHostAddress());

            dpacket.setAddress(remote_addr);

            dpacket.setPort(2000);

            dsocket.send(dpacket);
            System.out.println("Packet sent!!");
        } catch (UnknownHostException uhe) {
            System.err.println("Can't find host " + hostname);
        } catch (IOException t) {
            System.err.println("Error " + t);
        }
    }
}