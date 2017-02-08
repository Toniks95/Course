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
public class LinkedHashSetDemo {
public static void main(String args[]) {
// create a hash set
LinkedHashSet hs = new LinkedHashSet();
// add elements to the hash set
hs.add("B");
hs.add("A");
hs.add("D");
hs.add("E");
hs.add("C");
hs.add("F");
System.out.println(hs);
}
}