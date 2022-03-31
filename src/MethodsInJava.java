
public class MethodsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodDemo md=new MethodDemo(); //object
		int result=md.addTwoNumber(20, 30);
		System.out.println("addiation result is = "+result);
		int result2=md.addTwoNumber(30, 100);
		System.out.println("addiation result2 is = "+result2);
		int result3=md.addTwoNumber(100, 120);
		System.out.println("addiation result3 is = "+result3);
				
	}

}

class MethodDemo{
	int addTwoNumber(int a,int b) {
	int c=a+b;
	return c;
	}
}
