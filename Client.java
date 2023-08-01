package com.company;
import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        String serverAddress = "localhost";
        int serverPort = 12345;

        try (Socket socket = new Socket(serverAddress, serverPort)) {
            // Create input and output streams for the socket
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

            String inputLine;
            while ((inputLine = userInput.readLine()) != null) {
                // Send data to the server
                out.println(inputLine);

                // Receive a response from the server
                String response = in.readLine();
                System.out.println("Server response: " + response);

                if (inputLine.equalsIgnoreCase("quit")) {
                    break;
                }
            }

            // Close the streams and the socket
            in.close();
            out.close();
        }
    }
}


