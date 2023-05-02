package com.rah;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Stream;

public class ListOperations {
	
	public static void main(String[] args) {
	
	List <String> names = new ArrayList <> ();
	names.add("Rahul");
	names.add("Sumit");
	names.add("Rajan");
    names.add("Ridhan");
    names.add("Solty");
    names.add("Mina");
    names.add("Lal Babu Ray");
    names.add("Raja");
    names.add("Mayank");
    
    System.out.println("Names of Person  : " +names);
    
    String s1 = names.get(0);
    System.out.println("Retriving Person : " +s1);
    
    String s2 = names.get(3);
    System.out.println("Retriving Person : " +s2);
    
    int i1  = names.size();
    System.out.println("Size : " +i1);
   
    String s3 = names.remove(7);
    System.out.println("Removing Element  : " +s3);
    System.out.println("After Removing Person : " +names);
    
    int i2  = names.size();
    System.out.println("Size : " +i2);
    
    Boolean bo1 = names.isEmpty();
    System.out.println(bo1);
    
    String s4 = names.set(7,"Justin");
    System.out.println("Replacing the 7th person :" +s4);
    System.out.println("After Replacing 7th Person : " +names);
    
    names.add("Mia");
    names.add("Rishi");
    names.add("Rama");
    System.out.println("Adding Names : " +names);
    
    String s5 = names.set(8,"Siddhi");
    System.out.println("Replacing the 9th person :" +s5);
    System.out.println("After Replacing 9th Person : " +names);
    
    Boolean bo2 = names.contains("Rajan");
    System.out.println("Checking Names : " +bo2);
    
    System.out.println("====================================================");
    
//   Traversing Names (Iterator)
    
     Iterator<String> itr = names.iterator();
     System.out.println("Iterating through Iterator : " );
     while(itr.hasNext()) {
     System.out.println(itr.next());
     }
    System.out.println();
     
//   Traversing Names in forward direction (ListIterator)
    
     ListIterator <String> litr = names.listIterator();
     System.out.println("Iterating through ListIterator : " );
     System.out.println("Traversing the names in forward :");
     while(litr.hasNext()) {
     System.out.println(litr.next());	 
     } 
     System.out.println();
     
//   Traversing Names in backward direction (ListIterator)
     
     ListIterator<String> litr2 = names.listIterator(names.size());
     System.out.println("Traversing the name in backward");
	 while (litr2.hasPrevious()) {
	 System.out.println(litr2.previous());
	 }
	 System.out.println();
	 
//	 Traversing the name through Stream (Java 8)
	 System.out.println("Traversing through For Each Method");
	 names.forEach(e -> {
		System.out.println(e); 
	 });
	 
	 System.out.println("============ Set Collection ============");
	 
	 Set <String> set =new HashSet<>();
	 set.addAll(names);
	 System.out.println(set);
		
	 System.out.println("Set collection");	
	 
		}	 
}
