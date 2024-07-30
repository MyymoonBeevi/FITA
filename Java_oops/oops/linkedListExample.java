package oops;
import java.util.*;
public class linkedListExample {

	public static void main(String[] args) {
	
		
		LinkedList<String> Food = new LinkedList<String>();
		
		Food.add("PaniPoori");
		Food.add("BhelPoori");
		Food.add("kheer");
		Food.add("bannana");
		Food.remove(1);
		
		Iterator<String> itr = Food.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
		}
		
		
		

	}

}
