package practice;

public class PracticePrime {

	public PracticePrime() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(checkNumberIsPrime(101));
	}

	private static boolean checkNumberIsPrime(int checkNumber) {
		// TODO Auto-generated method stub
		if(checkNumber<=1) {
			return false;
		}
		else {
			for (int i = 2; i < checkNumber; i++) {
				if(checkNumber%i==0) {
					return false;
				}}
		return true;
		}		
}
}
