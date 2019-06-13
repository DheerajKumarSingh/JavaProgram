package test.logical;

public class ReverseIntegerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// System.out.print(""+reverseIntegerUsingModule(1348));
		System.out.print(""+reverseIntegerUsingRecursion(1348,0));

	}
	
	
	public static int reverseIntegerUsingRecursion(int inputNumber,int sum)
	{
		if(inputNumber<=0) {
			return sum;
		}
		else {
			int module=inputNumber%10;
			 sum=sum*10+module;
			 inputNumber=inputNumber/10;
			return reverseIntegerUsingRecursion(inputNumber,sum);
		}
	}
	
	
	public static int reverseIntegerUsingModule(int number)
	{
		int reverse=0;
		while(number>0) {
			int module=number%10;
			reverse=reverse*10+module;
			number=number/10;
		}
		return reverse;
	}

}
