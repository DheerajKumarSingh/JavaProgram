package test.logical;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//checkForPrime(9);
		printPrimeNumberOnly(12);

	}
	
	
	public static void printPrimeNumberOnly(int count)
	{
		for (int i=1;i<=count;i++) {
			
			int count1=0;
			boolean isPrime=false;
			for (int j=1;j<=i;j++) {
				if(i==1) {
					isPrime=true;
					break;
				}
				else {
					if(i%j==0) {
						count1++;
						if(count1>2) {
							isPrime=false;
							break;
						}
						else {
							isPrime=true;
						}
						
					}
				}
			}
			count1=0;
			if(isPrime) {
				System.out.print("\n"+i);
			}
		}
		
	}
	
	public static void checkForPrime(int givenNumber) {


		int count=0;
	    boolean isPrime=false;
		for (int i=1;i<=givenNumber;i++){
			
			if(givenNumber%i==0)
			{
				count++;
				if(count<=2) {
					isPrime=true;
				}
				else {
					isPrime=false;
				}
		    }
		}
		
		System.out.print(""+isPrime);
		
		
	}

}
