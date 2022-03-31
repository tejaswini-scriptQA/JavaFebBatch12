package StringPrograms;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Java is simple lang";
		String s1= "Java is simple lang";
		String s3= new String("Java is Simple Lang");
		
		System.out.println();
		System.out.println(s);
		System.out.println(s.charAt(6));
		System.out.println(s.substring(5));
		System.out.println(s.substring(5, 14));
		System.out.println(s.contains(s1));
		System.out.println(s.equalsIgnoreCase(s3));

	}

}
