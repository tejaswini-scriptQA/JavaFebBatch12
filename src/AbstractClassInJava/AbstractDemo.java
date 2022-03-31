package AbstractClassInJava;

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b= new B();
		b.display();
		b.show();
		b.print();

	}

}

abstract class A{
	A(){
		System.out.println("This is constructor of class A");
	}
	void display() {
		System.out.println("class A display method");
	}
	abstract void show();
	abstract void print();
}
class B extends A{
	void show() {
		System.out.println("class B show method");
	}
	void print() {
		System.out.println("this is show method");
	}
}