package practice;

public class PracticeStringPalindrome {

	public PracticeStringPalindrome() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="aaba";
		checkPalindrome_ConvertIntoPalindrome2(input);

	}

	private static void checkPalindrome_ConvertIntoPalindrome2(String input ) {
		// TODO Auto-generated method stub		
		int length=input.length();
		char[] arr=input.toCharArray();
		boolean isPalindrome = false;
		
		StringBuffer sb=new StringBuffer();
		
		for(int i=0;i<=length/2;i++) {
			if(arr[i]==arr[(length-1-i)]) {				
				isPalindrome=true;	
				sb.append(arr[i]);
			}
			else {
				arr[(length-1-i)]=arr[i];
			}
		}
		for (char c : arr) {
			System.out.print(c);	
		}
		
	}
	
	
	private static void checkPalindrome_ConvertIntoPalindrome(String input ) {
		// TODO Auto-generated method stub		
		int length=input.length();
		char[] arr=input.toCharArray();
		boolean isPalindrome = false;
		
		for(int i=0;i<=length/2;i++) {
			if(arr[i]==arr[(length-1-i)]) {				
				isPalindrome=true;	
			}
			else {
				arr[(length-1-i)]=arr[i];
			}
		}
		for (char c : arr) {
			System.out.print(c);	
		}
		
	}

}
