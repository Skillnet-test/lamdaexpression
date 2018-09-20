import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Unit1Exercise {

	public static void main(String[] args) {
		
		List<Person> list=new ArrayList();
		list.add(new Person("Charles","dickens",30));
		list.add(new Person("Lewis","carroll",21));
		list.add(new Person("Thomas","Carlyle",25));
		list.add(new Person("Charlotte","Brante",26));
		list.add(new Person("Mattern","Arnold",28));		
		
		// step1: sort list by last name		
		
		/*Unit1Exercise.sortingByLastName(
				()-> new Comparator(
						
				)
				
				
		);*/
		// step2: method to print all elements		
		
		
		// step3: print all who have lastname starts with C			
		
		

	}
	
	public static void sortingByLastName(sortLastName myLamdaSortLastName){
		myLamdaSortLastName.sortByLastName();
		
		
	}
	
	// step1: sort list by last name	
	public interface sortLastName{
		public void sortByLastName();
		
	}

}
