package test.logical;

public class BinarySearchProgram {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] input=new int[] {5,6,7,8,10,12,16,17,21,23,27,28,30};
		int keyword=30;
		int low=0;
		int hight=input.length-1;
		System.out.print(""+binarySearchWithRecursion(input,low,hight,keyword));

	}
	
	
	private static int binarySearchWithRecursion(int[] input, int low, int high, int number) {
		// TODO Auto-generated method stub
		
		if(high>=low)
		{
				int middle=(low+high)/2;
				
				if(input[middle]==number) {
					return middle;
				}
				else if(number>input[middle]) {
					return binarySearchWithRecursion(input, middle+1,high,number);
				}
				else if(number<input[middle]){
					return binarySearchWithRecursion(input, low, middle-1, number);
				}
		}
		
		return -1;
	}

	
	public static  int binarySearch(int[] input,int number)
	{
		// sort the array
		
		int low=0;
	    int high=input.length-1;
	    
	    while(high>=low) {
			    	
			    int middle=(low+high)/2;
			    if(input[middle]==number) {
			    	return middle;
			    }
			    else if(input[middle]> number) {
			    	high=middle-1;
			    }
			    else if(input[middle]<number)
			    {
			    	low=middle+1;
			    }
	    	
	    		     	}
	    	return -1;
	}

}
