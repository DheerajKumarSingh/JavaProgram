package test.logical;

public class LeapYearProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leapyear(2012);
		

	}

	public static void leapyear(int year)
	{
		
	boolean check;
	
	if(year%400==0)
	{
		check = true;
	}
	else if(year%4==0 && year%100!=0)
	{
		check = true;
	}

	else
	{
		check = false;

	}
	System.out.append(""+check);
	}
	
	
	
}
