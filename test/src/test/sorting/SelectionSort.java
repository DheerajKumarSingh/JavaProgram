package test.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("main is executing");
		
		int[] arr= {20,4,6,3,4,6,33,45,1,4,3};
		
		// first check first element 
		
		 for(int i=0;i<arr.length;i++) {
			 
			 int index=i;
			 
			 for (int j = i+1; j < arr.length; j++) {
				 if(arr[j]<arr[index]) {
					 index=j;
				 }
			}
			 int small=arr[index];
			 arr[index]=arr[i];
			 arr[i]=small;
		 }
		for (int i = 0; i < arr.length; i++) {
			System.out.print("\n"+arr[i]);
		}
	}

}
