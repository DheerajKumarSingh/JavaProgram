package test.logical;

public class StringPalindrome {
	
	public static void main(String[] args) {
		
	//	
	checkStringPalindrone("jaassaa");
		
		
	}
	
 
	public static void checkStringPalindrone(String input)

	{  
		StringBuilder reverseString=new StringBuilder();
		
		char[] arr=input.toCharArray();

	    
		for(int i=arr.length-1;i>=0;i--) {
			 {
				 reverseString =reverseString.append(arr[i]);
			 }
		}
		
		
		if(input.equals(reverseString.toString())) {
			System.out.print("String is palindrome");
		}
		else {
			System.out.print("String is not palindrome");
		}
		
		
		
		
		
	}

}
