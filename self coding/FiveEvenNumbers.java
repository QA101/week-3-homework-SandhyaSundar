import java.util.*;

public class FiveEvenNumbers {

	public static void main(String[] args) {
	
	 	Scanner console= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int inputNumber= console.nextInt();
		// construct the output array for length 5
		int[] outputNumber = new int [5];
		//Assigning the output of the method call to the array.
	    outputNumber=FiveEvenNumbers(inputNumber);
	    //display the values in the array using Arrays.toString().
		System.out.println("First five Even Numbers:"+Arrays.toString(outputNumber));
		}
	public static int[] FiveEvenNumbers(int methodInput) {
		int[] output= new int[5];
		// initialize an integer variable j and assign as value 0. 
		int j=0;
		for (int i=methodInput+1;i<=methodInput+10;i++) {
			if(i%2==0) {
		  //Assign the i value to the 0th position of output array.output[0]=i;
		   // here you to introduce a new variable"j" to capture index values and increment the same.   
		    	 output[j]=i;
		  //when j is incremented by 1 the index of the array is moved to 1st position.
		  j=j+1;
		 }
		}
		return output;
	}
}
