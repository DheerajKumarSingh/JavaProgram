package test.arrays;

public class SumClosestToZero {

	static int arr[]= {1,3,-5,7,8,20,-40,6};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method1();

	}
	
	

	



	private static void swap(int i, int j) {
		// TODO Auto-generated method stub
		int temp=arr[i];
		arr[j]=arr[i];
		arr[i]=temp;
	}

	private static void method1() {
		// The pair whose sum is closest to zero :  -5 and 6
				int smallSum=Integer.MAX_VALUE;
				int pairIndex1 = 0;
				int pairIndex2=0;
				for (int i = 0; i < arr.length; i++) {
					for (int j = i+1; j < arr.length; j++) {
						int sum=(arr[i]+arr[j]);
						if(Math.abs(sum)<Math.abs(smallSum)) {
							pairIndex1=i;
							pairIndex2=j;
							smallSum=sum;
						}
					}
				}
				System.out.print("pairIndex1:"+arr[pairIndex1]+"pairIndex2:"+arr[pairIndex2]);
	}
}
