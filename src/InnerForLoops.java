import java.util.Scanner;

public class InnerForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter number of rows");
		Scanner sc= new Scanner(System.in);
		int totalRow=sc.nextInt();						
		for(int row=1;row<=totalRow;row++) {		
			for(int st=1;st<=row;st++) {
				System.out.println("Hello java");
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.println("i= "+i+" j= "+j);
			}
			System.out.println();
		}

	}

}
