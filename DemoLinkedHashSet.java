//implement a program demonstrating Linked Hash Set
package com.collections;
//import LinkedHashSet package
import java.util.LinkedHashSet;
//class declaration
public class DemoLinkedHashSet {
    //main-function
	public static void main(String[] args) {
	//creating object for LinkedHashSet
    LinkedHashSet<String> lhs = new LinkedHashSet<String>();
    //methods for adding string
    lhs.add("ShriKrishna");
    lhs.add("Ganesh");
    lhs.add("Nithish");
    lhs.add("Sudheer");
    lhs.add("Prasad");
    for(String k:lhs)
    //print all string values
    System.out.println(k);
    //duplicate values
    lhs.add("Ganesh");
    //allow null value only once
    lhs.add(null);
    lhs.add(null);
    System.out.println(lhs);
    //print first value
    System.out.println(lhs.getFirst());
    //reversed elements
    System.out.println(lhs.reversed());
    System.out.println(lhs.size());
	}

}
