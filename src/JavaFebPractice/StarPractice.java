package JavaFebPractice;

public class StarPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row=10;
		for(int i=0;i<=row;i++) {
			for(int t=0;t<=row-i;t++) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}

}
