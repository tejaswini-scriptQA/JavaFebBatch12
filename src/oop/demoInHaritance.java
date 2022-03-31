package oop;

public class demoInHaritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c= new C();
		c.display();
		c.printNumber();
		c.show();
		System.out.println("a="+c.a+" b="+c.b+" c="+c.c);
		
	}

}
class A{
	int a=30;
	int b=50;
	int c=50;
	void display() {
		System.out.println("a="+a);
	}
}	
class B extends A{
	int b=50;
	void printNumber() {
		System.out.println("b="+b);
	}
}
class C extends B{
	int c=50;
	void show() {
		System.out.println("c="+c);
	}
}
