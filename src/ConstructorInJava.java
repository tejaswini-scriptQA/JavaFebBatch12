
public class ConstructorInJava {
	
	ConstructorInJava(){
		System.out.println("This is one arg constructor");
	}
	ConstructorInJava(int a){
		System.out.println("this is one arg constructor");
	}
	ConstructorInJava(int a,int b){
		System.out.println("this is 2 arg constructor");
	}
	ConstructorInJava(int a,int b,int c){
		System.out.println("this is 3 arg constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorInJava c= new ConstructorInJava(10,20,30);

	}

}
