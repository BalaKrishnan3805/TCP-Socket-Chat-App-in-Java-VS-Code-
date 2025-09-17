import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            // Connect to server (replace "localhost" with server IP if on different PC)
            Socket socket = new Socket("localhost", 1234);
            System.out.println("Connected to server. Type 'exit' to quit.");

            // Streams for communication
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader console = new BufferedReader(new InputStreamReader(System.in));

            String clientMessage, serverMessage;

            while (true) {
                // Send message to server
                System.out.print("Client: ");
                clientMessage = console.readLine();
                out.println(clientMessage);

                if (clientMessage.equalsIgnoreCase("exit")) {
                    break;
                }

                // Receive reply
                serverMessage = in.readLine();
                System.out.println("Server: " + serverMessage);
            }

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
