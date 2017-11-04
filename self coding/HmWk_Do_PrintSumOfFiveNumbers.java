
public class HmWk_Do_PrintSumOfFiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   int sum=0;
   int number=1;
   do {

	sum+= number;  //sum=sum+number;
	number=number+1;
    }
   
	while(number<=5);
         System.out.println("1+2+3+4+5="+sum);		
	}		
	}


