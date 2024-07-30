package oops;
import java.math.*;
public class Java_Practice {

	
	public static void main(String[] args) {
	
	
		int n = 775,r,sum = 0;
		
		int temp = n;
		
		while(n>0) {
			
			r = n%10;
			
			sum = (sum*10)+r;
			
			n = n/10;
			
			
		}
		
		if(sum == temp) {
			
			System.out.println("This is a palindrome number");
			
			
		}
		else {
			
			
			System.out.println("This is not a palindrome number");
		}
		}
		
		
		}
	


