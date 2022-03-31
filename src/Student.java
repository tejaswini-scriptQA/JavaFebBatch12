
public class Student {
	  String name;
	  int rollNumber;
	  String address;
	  Student(String StudentName,int StudentRollNumber,String StudentAddress ){
		  name= StudentName;
		  rollNumber= StudentRollNumber;
		  address= StudentAddress;
	  }
	  void StudentInfo() {
		  System.out.println("Name="+name);
		  System.out.println("rollNumber="+rollNumber);
		  System.out.println("address="+address);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Student teju= new Student(" Teju",1001," banglore");
        teju.StudentInfo();
        Student vargo= new Student(" Vargo",1025," usa");
        vargo.StudentInfo();
	}

}
