package test.arrays;
public class RotationArray {

	public RotationArray() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int arr[]= {12,2,34,1,5,6,7,4};
		int size=arr.length;
		int rotate=3;
		
        for (int i = 0; i < rotate; i++) {		
        	leftTwoRotate( arr, 4);
		}
	}
	
	
	public static void leftTwoRotate(int arr[],int size) {
		
		int temp=arr[0];
		
		for (int i = 0; i < arr.length-1; i++)
		{
			  arr[i]=arr[i+1];
		}
		arr[size-1]=temp;
		printArray(arr);
	}
	
	public static void printArray(int[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("*******************");
	}
	
	
}
