import java.util.Scanner;

public class ProductOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console= new Scanner(System.in);
		System.out.print("Enter the Number:");
		int inputNumber=console.nextInt();
		System.out.println("product of all digits is: " + ProductOfNumber(inputNumber));
			    
		}

		public static int ProductOfNumber(int methodInput) {
			//TODO Auto-generated method stub
		   int Product= 1;
		   int i = 0;
		for (i=methodInput;methodInput!=0;methodInput=methodInput/10) {
				i= methodInput%10;
				Product=Product*i;
				
		}
		 return Product;
	}

	//	while loop
	//	public static int ProductOfNumbers(int methodInput) {
	//	int i=0;
	//	int product=1;
		
		//while(methodInput!=0) {
			//i= methodInput%10;
			//methodInput=methodInput/10;
			//product=product*i;
	//	}
	//	return product;
	//	}
}
