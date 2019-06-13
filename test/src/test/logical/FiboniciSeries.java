package test.logical;

public class FiboniciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int current=0; int prev=1; // for manage extra 1 in series int next=0;
		 * 
		 * for(int i=0;i<12;i++) {
		 * 
		 * if(i== 0) { current=i; } else { current=prev+next; prev=next; next=current; }
		 * 
		 * System.out.print("\n"+current); }
		 */
		
		//System.out.print("\n"+fib(5));
		
		for(int i=0;i<=5;i++){
			System.out.print("\n"+fibonacci(i));
		}
	

	}
	
	  public static int fibonacci(int n)
	   {
	      if (n <= 0) return 0;
	      else if (n == 1) return 1;
	      else return fibonacci(n-1) + fibonacci(n-2);
	   }

}
