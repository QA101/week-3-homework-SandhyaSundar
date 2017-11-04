import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
	Scanner console= new Scanner(System.in);
	System.out.print("Enter the Number:");
	int inputNumber=console.nextInt();
	System.out.println("Sum of all digits is: " + SumOfNumber(inputNumber));
		    
	}

	public static int SumOfNumber(int methodInput) {
		// TODO Auto-generated method stub
	int Sum = 0;
	   int reminder=1;
		for(reminder=methodInput;methodInput!=0;methodInput=methodInput/10) {   
			reminder =methodInput%10;
			Sum= Sum+ reminder;
			}
	  return Sum;
	}
	
	//whileloop
	//public static int SumOfNumbers(int methodInput) {

    //  int i=1;
     // int sum=0;
     // while (methodInput!=0) {
        //=methodInput%10;
        //sum= sum+ i;
      //  methodInput=methodInput/10;
     // }
	 //return sum;
//}
}

