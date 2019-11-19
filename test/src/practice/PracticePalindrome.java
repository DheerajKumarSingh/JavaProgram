package practice;

public class PracticePalindrome {

	public PracticePalindrome() {
		//  Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseNumber();
	}

	private static void reverseNumber() {
		int data=32981;
		int sum=0;
		int temp=data;
		while(temp!=0)    {
			int remainder=temp%10;
			sum= sum*10+remainder;
			temp=temp/10; }
		System.out.print(sum);
	}
}
