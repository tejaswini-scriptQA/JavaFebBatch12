
public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {20,70,40,25,15,30};
		int maxNumber=0;
		for(int i=0;i<a.length;i++) {
			if(maxNumber<a[i]) {
				maxNumber=a[i];
			}
		}
		System.out.println("maxNumber="+ maxNumber);

	}

}
