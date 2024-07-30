package oops;

public class Work{
	


public static void main(String args[]) {
	
	 String[] News = {"Guru","Vignesh","Muthu","Kumar"};
	 int[] MagicNum = {55, 56, 45, 90, 100};
	 
	 News[0] = "Gvmk";
	 
	 for(int i=0; i<News.length; i++) {
		 
		 System.out.println(News[i]);
		 
	 }
	 
	 for (int num : MagicNum) {
		 System.out.println(num);
	}
	 
	 System.out.println(News[0]);
	
}

}