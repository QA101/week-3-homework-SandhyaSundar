import java.util.Scanner;

public class HmWk_Do_PrintSumOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console= new Scanner(System.in);
		System.out.print("Enter the Number:");
		int inputNumber=console.nextInt();
		System.out.println("Sum of all digits is: "+SumOfNumbers(inputNumber));
			    
		}
	public static int SumOfNumbers(int methodInput) {

     int i=1;// i(reminder)
     int sum=0;
     do {
    	i=methodInput%10;
        sum= sum + i;
        methodInput=methodInput/10;
     }     
    while (methodInput!=0);     
	return sum;
	}

}
