package Fifth_Code;

public class Referance_variable {
	int u = 60;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Referance_variable door = new Referance_variable();
		door.number();
		System.out.println(door.u);
		door.number("Shahim");
		door.number();
		door.number(500, 600);
		door.number(3000, 400, 87900);
		door.number(2.5f, 6.2f);

	}
	public void number() {
		System.out.println("This is non- Static method");
	}
	public void number(int a, int b) {
		int t = a+b;
		System.out.println(t);
	}
	public void number( int a, int b, int c) {
		int v = a+b+c;
		System.out.println(v);
		
	}
	public void number(Float a, float b) {
		Float f = a+b;
		System.out.println(f);
	}
	public void number(String name) {
		System.out.println(name);
	}

}
