package ExceptionHandling;

public class UnCheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=30;
		try {
			System.out.println("this is try");
			System.out.println(a/0);
			System.out.println("end of try block");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println("this is catch block");
			System.out.println(a/1);
		}
		
		System.out.println("Hello this is java program");
		System.out.println("Hello this is java program");
		System.out.println("Hello this is java program");

	}

}
