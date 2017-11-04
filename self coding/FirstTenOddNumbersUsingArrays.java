import java.util.*;
public class FirstTenOddNumbersUsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner console= new Scanner(System.in);
	System.out.print("Enter the Number:");
	int inputNumber=console.nextInt();
	int[] outputNumber=new int[10];
	outputNumber= FirstTenOddNumbers(inputNumber);

	System.out.println("First Ten Odd Numbers:"+ Arrays.toString(outputNumber));
	
		}
	public static int[] FirstTenOddNumbers(int methodInput) {
		// TODO Auto-generated method stub
		int[] output=new int[10];
		int j=0;
		for(int i=methodInput;i<=methodInput+19;i++) {
			if (i%2!=0) {
		  output[j]=i;
			j=j+1;
			}
		}
		return output;
	}

}
