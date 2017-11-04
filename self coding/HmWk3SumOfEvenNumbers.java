
public class HmWk3SumOfEvenNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=1;
		int Sum=0;
		
		while(number<=10) {
			if(number%2==0) {
		       if(number!=2) {
				System.out.print("+");	
				}		
				Sum= Sum+ number;
			System.out.print(number);
			}
		number++;
			
		}
		System.out.print("="+Sum);
	}

}
