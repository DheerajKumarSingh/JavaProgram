package test.logical;

import java.util.Arrays;

public class RemoveDublicateFromArray {

	public static void main(String[] args) {
		
		 Integer[] arr= new Integer[] {1,1,3,4,5,1,2,2};
		 removeDublicateFromString("12344 @j@");
		/*
		 * Arrays.parallelSort(arr); System.out.println("before removing element:"+arr);
		 * 
		 * Integer[] returnarr= removeDublicateValue(arr); for (Integer string :
		 * returnarr) { System.out.println("after removing element:"+string); }
		 */
		 
	}
	
	public static Integer[] removeDublicateValue(Integer[] inputarr)
	{
		Integer[] removeDublicate= new Integer[inputarr.length];
		int previousElement=inputarr[0];
		removeDublicate[0]=previousElement;
		 for(int i=1;i<inputarr.length;i++) {
			 int element=inputarr[i];
			 if(element !=previousElement) {
				 removeDublicate[i]=element;
			 }
			 previousElement=element;
		 }
		 
		 return removeDublicate;
	}
	
//  Using a boolean array remove dublicate charactor
	
	
	public static void removeDublicateFromString(String input)
	{
		char[] arr=input.toCharArray();
		boolean[] booleanCheck=new boolean[256];
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<arr.length;i++) {
			if(!booleanCheck[arr[i]]) {
                booleanCheck[arr[i]]=true;
				sb.append(arr[i]);
			}
		}
		
		System.out.print("result: "+sb.toString());
		
	}

}
