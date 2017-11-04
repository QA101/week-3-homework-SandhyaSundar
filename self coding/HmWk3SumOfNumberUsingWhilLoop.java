import java.util.Scanner;

public class HmWk3SumOfNumberUsingWhilLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner console= new Scanner(System.in);
		System.out.print("Enter the Number:");
		int inputNumber=console.nextInt();
		System.out.println("Sum of all digits is: " + SumOfNumbers(inputNumber));
			    
		}
	public static int SumOfNumbers(int methodInput) {

     int i=1;// i(reminder)
     int sum=0;
     while (methodInput!=0) {
        i=methodInput%10;
        sum= sum + i;
       methodInput=methodInput/10;
     }
	return sum;
}
}
