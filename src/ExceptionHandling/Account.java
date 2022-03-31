package ExceptionHandling;

public class Account {
      int balance =30000;
	
      public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
      void withdrow(int ammount) {
    	  if(balance>ammount) {
    		  balance=balance-ammount;
    		  System.out.println("Transection is done");
    	  }
    	  else {
    		  throw new RuntimeExeption
    	  }
      }

}
