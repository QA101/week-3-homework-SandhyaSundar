import java.util.Scanner;

public class MinimumOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.println("Enter Number:x=");
		System.out.println("Enter Number:y=");	
		int x=console.nextInt();
		int y=console.nextInt();
		System.out.println("Minimum Number:"+ MinimumOfTwo(x,y));
		
}
	public static int MinimumOfTwo(int x,int y) {
		// TODO Auto-generated method	

		int output= (int) Math.min(x,y);
	       //System.out.println(output);
		return output;
	}

}
