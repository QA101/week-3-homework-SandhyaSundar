import java.util.Scanner;

public class FiveEvenNumbersReturnAsString {

	public static void main(String[] args) {
	
	 	Scanner console= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int inputNumber= console.nextInt();
		String outputNumber = FiveEvenNumbers(inputNumber);
		System.out.println("First five Even Numbers: "+outputNumber);
		}

	
	public static String FiveEvenNumbers(int methodInput) {
		String outputString = "";
		for (int i=methodInput+1;i<=methodInput+10;i++) {
		      if(i%2==0) {
		   System.out.println("pre:"+ outputString);
		   outputString = outputString+String.valueOf(i)+",";	
		   System.out.println("post:"+outputString);
		 }
		}
		return outputString;
	}
}
