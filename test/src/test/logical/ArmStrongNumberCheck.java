package test.logical;

public class ArmStrongNumberCheck {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		checkNumberArmStrong(153);
	}

	
	public static void checkNumberArmStrong(int number)
	{
		
		int tempNumber=number;
		int finalNumber=0;
		
		while(tempNumber>0) {
			int remainder=tempNumber%10;
			finalNumber=finalNumber+(remainder*remainder*remainder);
			tempNumber=tempNumber/10;
		}
		
		if(number==finalNumber) {
		System.out.print("number is armstrong"+finalNumber);
		}
		else {
			System.out.print("number is not armstrong");
		}
	}
}
