package test.arrays;
public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {0,4,23,35,54,3,1,34};
		
		int highest=Integer.MIN_VALUE;
		int secondHihest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			int current=arr[i];
			
			if(current>highest) {
				secondHihest=highest;// notice      
				highest=current;
			}
			else if(current>secondHihest) {
				secondHihest=current;
			}
		}
		System.out.print("second highest"+secondHihest);
	}

}
