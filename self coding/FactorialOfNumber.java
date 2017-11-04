import java.util.*;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    //int number = 0;
		//printfactorial(number);
		Scanner console=new Scanner (System.in);
		System.out.println("Type a number:");
		int inputNumber=console.nextInt();
		int outputNumber=printfactorial(inputNumber);
	    System.out.println(inputNumber+"!="+ outputNumber);
		
	}

	public static int printfactorial(int number) {
		int product = 1;
		for(int i=1;i<=number;i++) {
			product*=i;
		//System.out.println(i+"!="+product);	
		
		}
	        return product;
	}
	}

