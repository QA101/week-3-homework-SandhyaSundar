import java.util.Scanner;

public class HmWk3_Do_PrintProductOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console=new Scanner(System.in);
		System.out.println("Enter a Number:");
		int inputNumber=console.nextInt();
        System.out.println("Product of all digits of a number:"+ ProductOfNumbers(inputNumber));
	}
   public static int ProductOfNumbers(int methodInput) {
	   int i=0;//i(reminder)=0;
	   int Product=1;
	   do
	   {
	  		i= methodInput%10;
			methodInput=methodInput/10;
			Product=Product*i;
	   }
	   while(methodInput!=0);
       return Product; 
   }
	}


