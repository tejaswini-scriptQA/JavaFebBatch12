
public class blookkInJava {

	{
		System.out.println("this is instance block1");		
	}
	
	{
		System.out.println("this is instance block2");
	}
	static {
		System.out.println("this is static block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is main");
		blookkInJava b= new blookkInJava();
		blookkInJava b1= new blookkInJava();
		blookkInJava b2= new blookkInJava();

	}

}
