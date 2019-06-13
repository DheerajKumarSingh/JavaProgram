package test.logical;

import java.util.Arrays;

public class ReverseArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nameArray=new String[] {"do","did","now","here"};
		reverseArrayProgram(nameArray);
	}

	private static void reverseArrayProgram(String[] nameArray) {
		// TODO Auto-generated method stub
		
		// we are using find mid element 
		// swap first to last element(middle) until first and last element are same
		// its complexity is o(n)
		
		if(nameArray==null && nameArray.length>2) {		
			return;
		}
		else {
			for (int i = 0; i < nameArray.length/2; i++) {
				String temp=nameArray[i];
				nameArray[i]=nameArray[(nameArray.length-1)-i];
				nameArray[nameArray.length-1-i]=temp;	
			}
		}
		System.out.print("\n"+Arrays.toString(nameArray));
	}

}
