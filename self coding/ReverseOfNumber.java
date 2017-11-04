import java.util.Scanner;

public class ReverseOfNumber {

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
		for ( ;methodInput!=0;methodInput=methodInput/10) {
		
			reverseNum= reverseNum*10;
			reverseNum=reverseNum+methodInput%10;
			//System.out.println("Value of reverseNum:"+reverseNum);
			//System.out.println("Value of methodInput:"+methodInput);	
}
   return reverseNum;
	}

}
