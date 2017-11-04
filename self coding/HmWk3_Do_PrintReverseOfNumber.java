import java.util.Scanner;

public class HmWk3_Do_PrintReverseOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console= new Scanner(System.in);
		System.out.print("Enter the Number:");
		int inputNumber=console.nextInt();
		System.out.println("Reverse of nuber is: " + ReverseOfNumber(inputNumber));
			    
		}

	public static int ReverseOfNumber(int methodInput) {
		// TODO Auto-generated method stub
		
		int reverseNum=0;
		do {	
			reverseNum= reverseNum*10;
			reverseNum=reverseNum+methodInput%10;
			methodInput=methodInput/10;	
}
   while(methodInput!=0);
   return reverseNum;	
	}
}
