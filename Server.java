

//Server.java
// A Java program for a Server
import java.net.*;
import java.io.*;

class Server {
    // initialize socket and input stream
    private Socket socket = null;
    private ServerSocket server = null;
    private DataInputStream in = null;
    private DataOutputStream out = null;

    // constructor with port
    public Server(int port) {
        // starts server and waits for a connection
        try {
            server = new ServerSocket(port);
            System.out.println("Server started");
            System.out.println("Waiting for a client ...");
            socket = server.accept();
            System.out.println("Client accepted");
            // takes input from the client socket
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            out = new DataOutputStream(socket.getOutputStream());
            String line = " ";
            String outputLine = " ";
            // reads message from client until "I am done" is sent
            while (!line.equals("I am done")) {
                try {
                    line = in.readUTF();
                    System.out.println(line);
                    outputLine = line.toUpperCase() + "\n";
                    out.writeUTF(outputLine);
                } catch (IOException i) {

                    System.out.println(i);
                }
            }
            System.out.println("Come Back Again!");
            System.out.println("Closing connection");
            // close connection
            socket.close();
            in.close();
        } catch (IOException i) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Server server = new Server(5500);
    }
}