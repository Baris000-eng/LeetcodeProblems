// package com.examples;

import java.io.*;
import java.net.*;

public class EchoClient {
  public static void main ( String... args ) throws IOException {

    String host;
    int port;

        System.out.println("Binding to port localhost:9999");
        host = "localhost";
        port = 9999;
      

    try (
            Socket echoSocket = new Socket ( host, port );
            PrintWriter out =
                    new PrintWriter ( echoSocket.getOutputStream (), true );
            BufferedReader in =
                    new BufferedReader (
                            new InputStreamReader ( echoSocket.getInputStream () ) );
            BufferedReader stdIn =
                    new BufferedReader (
                            new InputStreamReader ( System.in ) )
    ) {
        System.out.println("Type in some text please.");
        String userInput;
        userInput = stdIn.readLine();
            out.println ( userInput );
            System.out.println ( "echo: " + in.readLine () );
       
    }
  }
}
