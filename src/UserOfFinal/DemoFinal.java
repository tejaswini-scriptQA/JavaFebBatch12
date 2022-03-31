package UserOfFinal;

public class DemoFinal {
	
	final int a;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int a=10;
		a=40;

	}

}

class A{
	void display() {
		System.out.println("A:display");
	}
}
final class B extends A{
	void display() {
		System.out.println("B:display");
	}
}
