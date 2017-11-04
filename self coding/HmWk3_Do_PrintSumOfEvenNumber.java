
public class HmWk3_Do_PrintSumOfEvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=1;
		int Sum=0;
		do{
			  number++;
			if(number%2==0) {
				if(number!=2) {
				System.out.print("+");	
			}
				Sum= Sum+ number;	
			System.out.print(number);
			}
		}
		 while(number<=10) ;
		  System.out.print("="+Sum);
	}

}
