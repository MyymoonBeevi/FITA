package oops;
import java.util.*;
import java.io.*;

public class oopsDs{
	
	
	public void HashSetExample() {
		HashSet<String> Places = new HashSet<String>();
		
		Places.add("chennai");
		Places.add("Bhutan");
		Places.add("Cochin");
		Places.add("Nagpur");
		
		Iterator<String> itr = Places.iterator();
		
		while(itr.hasNext()){
			
		System.out.println(itr.next());	
			
		}
	}
		public void LinkedSetExample() {
			
			LinkedHashSet<String> Ben = new LinkedHashSet<String>();
			
			Ben.add("SGgsg");
			Ben.add("Bine");
			Ben.add("jjems");
			Ben.add("snnenn");
			Ben.add("bbebeb");
			Ben.add("nskqkwkw");
			Ben.remove("jjems");
			
			Iterator itr1 = Ben.iterator();
			while(itr1.hasNext()){
				
				System.out.println(itr1.next());	
					
				}
		}
		
		
	public void ArrayListExample() {
		
		
		ArrayList<String> Medicine = new ArrayList<String>();
		
		Medicine.add("cld50");
		Medicine.add("fold20");
		Medicine.add("Tin30");
		Medicine.add("Pom90");
		System.out.println(Medicine);
		System.out.println(Medicine.get(3));
		
	}
	
	public void LinkedListExample() {
LinkedList<String> Medicine = new LinkedList<String>();
		
		Medicine.add("cld50");
		Medicine.add("fold20");
		Medicine.add("Tin30");
		Medicine.add("Pom90");
		
		System.out.println(Medicine.get(3));
		Medicine.addFirst("Denns90");
		Medicine.addLast("sjsk10");
		System.out.println(Medicine);
		
		
	}
	
	public void mapExample() {
		
		
		
		HashMap<String, String> TNCA = new HashMap<String, String>();
		TNCA.put("Manager", "RamSrini");
		TNCA.put("Server", "Ramesh");
		TNCA.put("Player", "Kamatesh");
		TNCA.put("Server2", "Ramesh3");
		System.out.println(TNCA.get("Server"));
		
		
	}
	
	public void LinkedMapExample() {
		
		LinkedHashMap<String, String> TNCA = new LinkedHashMap<String, String>();
		TNCA.put("Manager", "RamSrini");
		TNCA.put("Server", "Ramesh");
		TNCA.put("Player", "Kamatesh");
		TNCA.put("Server2", "Ramesh3");
		System.out.println(TNCA);
		
	}
	
		
		
	
	public static void main(String[] args) {
		
		oopsDs object1 = new oopsDs();
		
		object1.LinkedMapExample();
		
		
	}
	
	
	
}