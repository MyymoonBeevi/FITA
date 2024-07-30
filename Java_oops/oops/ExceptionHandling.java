package oops;

public class ExceptionHandling {

	int marks = 45;
	
	public void divide(int num1, int num2) {
		
		try {
		
		int result = num1/num2;
		
		System.out.println("The answer of dividing two numbers is " + result);
		}
		catch(ArithmeticException e) {
			System.out.println("Something went wrong Error!!");
			
		}
		catch(Exception e) {
			
			System.out.println("Something went wrong divide by zero exception");
		}
		finally {
			
			System.out.println("This is from finally block");
		}
		
	}
	
	public void divide2(int num1, int num2) throws ArithmeticException {
		
		try {
int result = num1/num2;
		
		System.out.println("The answer of dividing two numbers is " + result);
		}
		catch(ArithmeticException e) {
			
			throw new ArithmeticException("Divide by zero not allowed mathematically");
			
		}
	}
	
	public static void main(String[] args) {

		ExceptionHandling obj1 = new ExceptionHandling();
	
	try {
		
		obj1.divide2(33, 0);
		
	}
	catch(Exception e) {
		
		System.out.println(e.getMessage());
	}

	}

}
