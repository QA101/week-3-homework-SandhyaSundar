import java.util.Scanner;

public class ReturnSwapOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner console=new Scanner(System.in);
		System.out.println("Enter the number x:");
		System.out.println("Enter the number y:");
		int x=console.nextInt();
		int y=console.nextInt();
		SwapOfNumbers(x,y);
  		  		
	}
	public static void SwapOfNumbers(int x,int y) {
		// TODO Auto-generated method 
		int temp;	
		
		temp=x;
		x=y;
		y=temp;
	System.out.println("x:"+x +" y:"+y);
	}

}
