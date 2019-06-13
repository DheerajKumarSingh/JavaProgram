package test.arrays;

public class FindOddNumberTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {20, 40, 50, 40, 50, 20, 30, 30, 50, 20, 40, 40, 20};
		
		int result=0;
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print("result: "+result+" ^"+ arr[i]);
			result= result ^ arr[i];
			System.out.print("===: "+result+"\n");
		}
		
		System.out.print("::::::::::"+result);

	}

}
