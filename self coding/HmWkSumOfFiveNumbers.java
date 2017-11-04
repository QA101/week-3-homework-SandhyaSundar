
public class HmWkSumOfFiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int sum=0;
		int number=1;
			while(number<=5) {
			    if(number!=1) {
				System.out.print("+");
		 }
			   sum+= number;  //sum=sum+number;
			   System.out.print(number);
				number=number+1;
			}
	   System.out.println("="+sum);
	}

}
