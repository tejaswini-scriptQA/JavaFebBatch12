package InterfaceInJava;

public class DemoInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a;
         a= new B();
         a.display();
         a.show();
	//	B b= new B();
				    
        a= new D();
        a.display();
        a.show();
	}

}

        interface A{
	      void display();
	      void show();
      }
        class D implements A{
	      public void display() {
		     System.out.println("class D display method");
	 }
	    public void show() {
		     System.out.println("class D show method");
	 }
    }
        class B implements A{
           public void display() {
	         System.out.println("this display method");
    }
	       public void show() {
		     System.out.println("this show method");
	 }
    }
        