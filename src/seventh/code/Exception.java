package seventh.code;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
		
		int a= 60;
		int b=0;
		int c =a/b;
		System.out.println(c);

	}
		catch(ArithmeticException e) {
			System.out.println("Please corect the int value to solve the error!");
			
		}
			
		
	}
}
