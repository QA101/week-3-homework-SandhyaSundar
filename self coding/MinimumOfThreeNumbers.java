import java.util.Scanner;

public class MinimumOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console=new Scanner(System.in);
		System.out.println("Enter Number:x=");
		System.out.println("Enter Number:y=");	
		System.out.println("Enter Number:z=");
		int x=console.nextInt();
		int y=console.nextInt();
		int z=console.nextInt();
		System.out.println("Minimum Number:"+ MinimumOfThree(x,y,z));
		
	}

	public static int MinimumOfThree(int x, int y, int z) {
		// TODO Auto-generated method stub
		if (x<y && x<z) {
			return x;
		}
			else if(y<z) {
				return y;
		}					
			else { 
				return z;		
		}
	}

}
