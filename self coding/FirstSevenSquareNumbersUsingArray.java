import java.util.Arrays;
import java.util.Scanner;

public class FirstSevenSquareNumbersUsingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console=new Scanner(System.in);
		System.out.print("Enter the Number:" );
		int inputNumber=console.nextInt();
		double[] outputNumber= FirstSevenSquareNumbers(inputNumber);
		System.out.println("First seven square numbers:"+ Arrays.toString(outputNumber));
			
}
	public static double[] FirstSevenSquareNumbers(int methodInput) {
		// TODO Auto-generated method stub
		double[] output=new double[7];
		int j=0;// create and initialize variable j  to get output.
		
		//variable i should be incremented when the condition is true.
		for (int i=methodInput;i<=methodInput+6;i++) {
			System.out.println("Value of i in for loop:"+i);
			 // formula for finding the square of numbers.
			// assign output array with values of i.
				output[(int)j] = Math.pow(i,2);
						j=j+1;		 
	     } 
		
			return output;
		
	}
}
