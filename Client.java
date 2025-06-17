

//  Client.java
// A Java program for a Client
import java.net.*;
import java.io.*;
import java.util.Scanner;

class Client {
    // initialize socket and input output streams
    private Socket socket = null;
    private DataInputStream input = null;
    private DataOutputStream out = null;
    private DataInputStream in = null;

    // constructor to put ip address and port
    public Client(String address, int port) {
        // establish a connection
        try {
            socket = new Socket(address, port);

            System.out.println("Connected");

            // takes input from terminal
            input = new DataInputStream(System.in);
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));

            // sends output to the socket
            out = new DataOutputStream(socket.getOutputStream());
        } catch (UnknownHostException u) {
            System.out.println(u);
        } catch (IOException i) {
            System.out.println(i);
        }
        // string to read message from input
        String inputLine = "";
        String outputLine = " ";
        Scanner sc = new Scanner(System.in);
        // keep reading until "i am done" is input
        while (!inputLine.equals("I am done")) {
            try {
                inputLine = sc.nextLine();
                out.writeUTF(inputLine);

                outputLine = in.readUTF();

                System.out.println("Server says: " + outputLine);
            } catch (IOException i) {
                System.out.println(i);
            }
        }
        // close the connection
        try {
            System.out.println("Thankyou! Come back again.");
            System.out.println("Connection Close");
            input.close();
            out.close();
            socket.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        Client client = new Client("localhost", 5500);
    }
}