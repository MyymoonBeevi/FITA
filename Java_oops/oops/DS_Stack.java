package oops;
import java.util.Iterator;
import java.util.Stack;
import java.util.*;


public class DS_Stack {

	public static void main(String[] args) {
		

Stack<String> beaches = new Stack<String>(); 

beaches.add("marina");
beaches.add("ecr");
beaches.add("thiruvaanmiyur");
beaches.clone();
beaches.clear();
beaches.add("marina");
beaches.add("ecr");
beaches.add("thiruvaanmiyur");
beaches.containsAll(beaches);

Iterator<String> itr2 = beaches.iterator();

while(itr2.hasNext()) {
	
	System.out.println(itr2.next());
}












	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	


}

