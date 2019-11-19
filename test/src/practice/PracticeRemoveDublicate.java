package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PracticeRemoveDublicate {

	

	public static void main(String[] args) {
	
	// solution1();
	// solution2("dheeraj singh");  
	//	countSolution("dsheerajs");
	//	greatestCommonDevision();
//	System.out.print(GDCwithRecursion(36,60));
		
		
		
		int[] arr=new int[] {1,2,4,611,12,24,56,78,90,912};
		/*
		 * int input=12;
		 * 
		 * System.out.print(practiceBinarySearch(arr,input));
		 */
		//findMaxTwoNumber(arr);
		System.out.print(findSmallest());
	}
	
	static int findSmallest()  
    { 
		int[] arr=new int[] {1, 2, 6, 10, 11, 15}; 
		int n=arr.length;
        int res = 1; // Initialize result 
  
        // Traverse the array and increment 'res' if arr[i] is 
        // smaller than or equal to 'res'. 
        for (int i = 0; i < n&& arr[i] <= res; i++) 
            res = res + arr[i]; 
        	System.out.print("res:"+res+"\n");
        return res; 
    } 

	private static void findMaxTwoNumber(int[] arr) {
		// TODO Auto-generated method stub
		
		int max1=Integer.MIN_VALUE;
		int max2=Integer.MIN_VALUE;
		
		for (int i : arr) {
			
			if(i>max1) {
				max2=max1;
				max1=i;
			}
	
			
		}
		
		System.out.print(""+max1+"max2:"+max2);
		
	}

	private static int practiceBinarySearch(int[] arr,int input) {
		// TODO Auto-generated method stub
		
		// sorted array
		
		int low=0;
		int high=arr.length-1;
	
		
		while(high>=low) {
			
			int middle=(low+high)/2;
			if(input==arr[middle]) {
				return middle;
			}
			else if(input<arr[middle]) {
				high=middle-1;
			}
			else if(input>arr[middle]){
				low=middle+1;
			}
			
			
		}
		return -1;
		
		
		
		
		
		
		
	}

	private static int  GDCwithRecursion(int a, int b) {
		// TODO Auto-generated method stub
		if(a==0) {
			return b;
		}
		if(b==0) {
			return a;
		}
		if(a==b) {
			return a;
		}
		if(a>b) {
			return  GDCwithRecursion(b,a%b);
		}
		return GDCwithRecursion(a,b%a);
	}

	private static void greatestCommonDevision() {
		// TODO Auto-generated method stub
		
		int a=60;
	 	int b=36;
		int c=0;
		 
		while(a%b>0) {
			c=a%b;
			a=b;
			b=c;
		}
		
		System.out.print(c);
	}

	private static void countSolution(String input) {
		char[] arr=input.toCharArray();
		int[] count=new int[256];
		
		for(int i=0;i<arr.length;i++) {
			count[arr[i]]=count[arr[i]]+1;
		}
		
		for (int i = 0; i < count.length; i++) {
			if(count[i]>1) {
				System.out.printf("%c,%d ",i,count[i]);
			}
		}

	}

	private static void solution2(String input) {
		char[] data=input.toCharArray();
		boolean[] blarray=new boolean[256];
		StringBuilder sb=new StringBuilder();
		for (int i = 0; i < data.length-1; i++) {
			if(!blarray[data[i]])
			{
				blarray[data[i]]=true;
				sb.append(data[i]);
			}
		}
		System.out.append("\n"+sb.toString());
	}

	private static void solution1() {
		// TODO Auto-generated method stub
		Integer arr[] =new Integer[] {1,1,6,2,4,1,3,6,6,6,6,5,3,5,5};	
		List<Integer> list=new ArrayList<Integer>();
	    list=Arrays.asList(arr);
	    Collections.sort(list);
	    Integer[] ar=new Integer[arr.length];
	    for (int i = 0; i < arr.length-1; i++) {
	        int prev=list.get(i);
	    	int next=list.get(i+1);
	    	if(prev!=next) {
	    		ar[i]=prev;
	    		prev=next;
	    	}
	    	else {
	    		if(i+1==arr.length-1) {
	    			ar[i]=prev;
	    		}
	    	}
		}
	    for (int i = 0; i < ar.length; i++) {
	    	System.out.print(ar[i]);
		}
	}
}
