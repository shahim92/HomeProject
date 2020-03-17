 package coding;

public class Core {
	int spool = 60;
	static int option = 600;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");
int firstNumber = 30;
int secondNumber = 40;
int total = firstNumber + secondNumber;
System.out.println("The total of the number is "+ total);
float thirdNumber = 60.21f;
float fourthNumber = 50.648f;
double totalNumber = thirdNumber+fourthNumber;
System.out.println("The total of the number is "+totalNumber);
Multiplication();
Division();
Minus();
System.out.println(option);




	}
public static void Multiplication() {
	int a = 30;
	int b = 40;
	int c = a*b;
	System.out.println(c);
	System.out.println("this is call global multiplication" +option);
}
public static void Division () {
	int a = 500;
	int b = 200;
	int c = a/b;
	System.out.println(c);
}
public static void Minus() {
	int a = 600;
	int b = 400;
	int c = a-b;
	System.out.println(option);
}

}
