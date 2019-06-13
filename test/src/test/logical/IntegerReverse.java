package test.logical;

public class IntegerReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseNumber(3445);
	}
	
	public static void reverseNumber(int number)
	{
		int tempNumber=number;
		int reverse=0;
		
		while(tempNumber>0) {
			int remainder=tempNumber%10;
			reverse=reverse*10+remainder;
			tempNumber=tempNumber/10;
		}
		
		
		 System.out.print("reverse number"+"reverse number"+reverse);
	}

}
