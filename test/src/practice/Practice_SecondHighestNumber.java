package practice;

public class Practice_SecondHighestNumber {

	public Practice_SecondHighestNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= new int[] {2,5,4,6,8,91,99};
		int max = 0;
		int secondHighest=0;
		int MIN_VALUE=Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>MIN_VALUE) {
				secondHighest=max;
				max=arr[i];
			}
		}
		System.out.print(""+secondHighest);
	}

}
