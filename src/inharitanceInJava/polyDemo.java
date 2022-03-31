package inharitanceInJava;

public class polyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		polyDemo p=new polyDemo();
		System.out.println(p.add(20,40));
		System.out.println(p.add(20.20f, 30.30f));
		System.out.println(p.add(10, 20, 30, 20));
	}

	int add(int a,int b) {
		return a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}
	
	float add(float a, float b) {
		return a+b;
	}
	int add(int a, int b, int c, int d) {
		return a+b+c+d;
	}
}


