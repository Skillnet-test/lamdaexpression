import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class SolutionWithJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Person> list=new ArrayList();
		list.add(new Person("Charles","dickens",30));
		list.add(new Person("Lewis","carroll",21));
		list.add(new Person("Thomas","Carlyle",25));
		list.add(new Person("Charlotte","Brante",26));
		list.add(new Person("Mattern","Arnold",28));		
		
		
		// step1: sort list by last name	
		// to use comparator either we have to use 
		// a class which is implementing comparator
		// and use that class object
		// or inline anonimious class
		Collections.sort(list,new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getSecondName().compareTo(o2.getSecondName());
				
			}
		});
		
		
				
		// step2: method to print all elements
		 System.out.println("printing all data");
	     printAllObj(list);
		
				
				
		// step3: print all who have lastname starts with C	
	     System.out.println("printing all objects which has second name starts with c");
	     printConditionally(list, new conditional(){

			@Override
			public boolean printCondition(Person p) {
				return p.getSecondName().startsWith("C");
			}  	 
	    	 
	    	 
	     });
				

	     System.out.println("printing all objects which has first name starts with c");
	     printConditionally(list, new conditional(){

			@Override
			public boolean printCondition(Person p) {
				return p.getFirstName().startsWith("C");
			}  	 
	    	 
	    	 
	     });

	}
	

	private static void printConditionally(List<Person> list, conditional c) {
		// TODO Auto-generated method stub
		for(int i=0; i< list.size();i++){
			Person p=(Person) list.get(i);
			
			if(c.printCondition(p)){
				System.out.println(p.toString());
			}
			
			
		}
		
	}

	public static void printAllObj(List<Person> list){
		for(int i=0; i< list.size();i++){
			Person p=(Person) list.get(i);
			System.out.println(p.toString());
			
		}
		
		System.out.println();
		
	}
	
	

}

interface conditional{
	boolean printCondition(Person p);
	
}



