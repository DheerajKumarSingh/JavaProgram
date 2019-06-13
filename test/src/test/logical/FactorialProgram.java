package test.logical;

public class FactorialProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// findFactorial(5);
		
	
		System.out.print(findFactorialByRecursion(3));
		
	}
	
	public static void findFactorial(int number) {
		
		int factorial=1;
		
		for (int i = 5; i >0; i--) {
			
			factorial=factorial*i;
			
		}
		System.out.print(""+factorial);
		
	}
	
	// we use haid recursion 
	public static  int  findFactorialByRecursion(int number) {
		
		if(number==1) {
			return number;
		}
		else {
			return number* findFactorialByRecursion(number-1);
		}
	}

}
