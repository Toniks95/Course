/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serialization;

/**
 *
 * @author Tomek
 */
import java.io.*;
public class SerializeDemo
{
public static void main(String [] args)
{
Employee e = new Employee();
e.name = "Reyan Ali";
e.address = "Phokka Kuan, Ambehta Peer";
e.SSN = 11122333;
e.number = 101;
try
{
FileOutputStream fileOut =
new FileOutputStream("C:/Users/Tomek/Documents/NetBeansProjects/collections/employee.ser");
ObjectOutputStream out = new ObjectOutputStream(fileOut);
out.writeObject(e);
out.close();
fileOut.close();
System.out.printf("Serialized data is saved in C:/Users/Tomek/Documents/NetBeansProjects/collections/employee.ser");
}catch(IOException i)
{
i.printStackTrace();
}
}
}

