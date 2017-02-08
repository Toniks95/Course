/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author Tomek
 */
import java.util.*;
public class ArrayAndLinkedListDemo {
public static void main(String[] args) {
List a1 = new ArrayList();
a1.add("Zara");
a1.add("Mahnaz");
a1.add("Ayan");
System.out.println(" ArrayList Elements");
System.out.print("\t" + a1);
List l1 = new LinkedList();
l1.add("Zara");
l1.add("Mahnaz");
l1.add("Ayan");
System.out.println();
System.out.println(" LinkedList Elements");
System.out.print("\t" + l1);
}
}
