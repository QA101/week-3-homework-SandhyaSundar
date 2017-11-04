
public class FirstTenOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int limit=20;
	System.out.print("Ten Odd Numbers:");
	
	FirstTenOddNumbers(limit);
	
		
	}

	public static void FirstTenOddNumbers(int limit) {
		// TODO Auto-generated method stub
		for(int i=1;i<=limit;i++) {
			if (i%2!=0) {
		  System.out.print(i+" ");
			}
		}
	}

}
