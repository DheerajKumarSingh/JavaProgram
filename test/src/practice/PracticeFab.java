package practice;

public class PracticeFab {
	
	public PracticeFab() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// normalFib();
		for(int i=0;i<=10;i++) {
			System.out.print("\n"+fibWithRecursion(i));
		}
		
	}

	private static int fibWithRecursion(int n) {
		if(n==0 || n==1) {
			return n;
		}
		return n=fibWithRecursion(n-2)+fibWithRecursion(n-1);
		
	}

	private static void normalFib() {
		// TODO Auto-generated method stub
		int prev=0;
		int next=1;
		int sum=0;
		
		for (int i = 0; i < 12; i++) {
			if(i==0 || i==1) {
				System.out.print("\n"+i);
			}
			else {
				sum=prev+next;
				prev=next;
				next=sum;
				System.out.print("\n"+next);
			}
		}
	}
	
	
	

}
