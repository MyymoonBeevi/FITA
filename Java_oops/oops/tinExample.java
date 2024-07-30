package oops;

import java.util.ArrayList;
import java.util.Iterator;

public class tinExample {

	public static void main(String[] args) {
		

		ArrayList<String> numbers = new ArrayList<String>();
		
		numbers.add("Five");
		numbers.add("twelve");
		numbers.add("six");
		numbers.add("out");
		numbers.add("ten");
		numbers.remove(4);
		
		
		Iterator itr1 = numbers.iterator();
		
		for(int i=0;itr1.hasNext();i++) {
			
			
			System.out.println(itr1.next());
		
			
		}
		
		
	
		
		
		
	}

}
