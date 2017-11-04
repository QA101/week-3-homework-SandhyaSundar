
public class FirstSevenSquareNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int limit=7;
		System.out.println("First Seven Square Numbers:");
		FirstSevenSquareNumbers(limit);
	
	
	}

	public static void FirstSevenSquareNumbers(int limit) {
		// TODO Auto-generated method stub
		for (int i=1;i<=limit;i++) {
		     int output =(int) Math.pow(i,2);
	     	     System.out.print(output+ " ");
		}
	
		
	}
}
