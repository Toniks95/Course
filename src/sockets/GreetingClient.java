/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sockets;

/**
 *
 * @author Tomek
 */
// File Name GreetingClient.java
import java.net.*;
import java.io.*;
public class GreetingClient
{
public static void main(String [] args)
{
//String serverName = args[0];
//int port = Integer.parseInt(args[1]);
String serverName = "localhost";
int port = 6066;
try
{
System.out.println("Connecting to " + serverName +
" on port " + port);
Socket client = new Socket(serverName, port);
System.out.println("Just connected to "
+ client.getRemoteSocketAddress());
OutputStream outToServer = client.getOutputStream();
DataOutputStream out = new DataOutputStream(outToServer);
out.writeUTF("Hello from "
+ client.getLocalSocketAddress());
InputStream inFromServer = client.getInputStream();
DataInputStream in =
new DataInputStream(inFromServer);
System.out.println("Server says " + in.readUTF());
client.close();
}catch(IOException e)
{
e.printStackTrace();
}
}
}