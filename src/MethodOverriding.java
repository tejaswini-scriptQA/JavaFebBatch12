
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Login capOne= new Login();
		capOne.loginApp();
		System.out.println("-------------------------------------------------");
		Newlogin city=new Newlogin();
		city.loginApp();

	}

}

class Login{
	void loginApp() {
		System.out.println("Enter user name");
		System.out.println("Enter Password");
		System.out.println("Click submit button");
	}
}
class Newlogin extends Login{
	void loginApp() {
		System.out.println("Enter user name");
		System.out.println("Enter Password");
		System.out.println("Enter phone Number");
		System.out.println("Click submit button");
	}
}