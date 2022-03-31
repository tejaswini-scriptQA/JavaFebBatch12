
public class VariableType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableDemo d= new VariableDemo();
		d.incrementByOne();
		d.printData();
		VariableDemo d1= new VariableDemo();
		d1.incrementByOne();
		d1.printData();
		
		VariableDemo d3= new VariableDemo();
		d3.incrementByOne();
		d3.printData();

	}

}

class VariableDemo{
	int a=30;  //instance variable
	static int b=30;  //static variable
	void incrementByOne() {
		a=a+1;
		b=b+1;
	}
	void printData() {
		System.out.println("a="+a+" b="+b);
	}
}

