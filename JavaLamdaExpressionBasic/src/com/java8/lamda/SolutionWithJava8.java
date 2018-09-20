package com.java8.lamda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class SolutionWithJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Person> list=new ArrayList();
		list.add(new Person("Charles","dickens",30));
		list.add(new Person("Lewis","carroll",21));
		list.add(new Person("Thomas","Carlyle",25));
		list.add(new Person("Charlotte","Brante",26));
		list.add(new Person("Mattern","Arnold",28));		
		
		
				
		// through java 8 with lamda expression
		Collections.sort(list,(Person o1, Person o2)->o1.getSecondName().compareTo(o2.getSecondName()));
		
				
		// step2: method to print all elements
		 System.out.println("printing all data");
		 printConditionally(list,(p)->true);
		
				
				
		// step3: print all who have lastname starts with C	
	     System.out.println("printing all objects which has second name starts with c");
	     	     
	    // through java 8 with lamda expression
	     printConditionally(list,(Person p)->p.getSecondName().startsWith("C"));
				

	     System.out.println("printing all objects which has first name starts with c");
	     	     
	  // through java 8 with lamda expression
	     printConditionally(list,(Person p)->p.getFirstName().startsWith("C"));
	     

	}
	
	

	private static void printConditionally(List<Person> list, Predicate<Person> predicate) {
		// TODO Auto-generated method stub
		for(int i=0; i< list.size();i++){
			Person p=(Person) list.get(i);
			
			if(predicate.test(p)){
				System.out.println(p.toString());
			}
			
			
		}
		
	}

	
	
	

}





