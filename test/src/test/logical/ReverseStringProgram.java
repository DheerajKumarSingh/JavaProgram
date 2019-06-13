package test.logical;

public class ReverseStringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //  reverseStringgetBytes("dheeraj");
        reverseStringtoCharArray("dheeraj");
	}

	public static void reverseStringtoCharArray(String input)
	{
		char[] arr=input.toCharArray();
		char[] reverse=new char[arr.length];
		StringBuilder stringBuilder=new StringBuilder();
		
		for (int i = arr.length-1; i >=0; i--) {
			reverse[arr.length-1-i]=arr[i];
			stringBuilder.append(arr[i]);
		}
		
		for (char c : reverse) {
			System.out.print("\n "+c);
		}
		System.out.print("\n "+stringBuilder.toString());
	}
	public static void reverseStringgetBytes(String input)
	{
		byte[] inputByteString=input.getBytes();
		byte[] resultData=new byte[inputByteString.length];
		
		for (int i = 0; i < inputByteString.length; i++) {
			resultData[i]=inputByteString[(inputByteString.length-1)-i];
			
		}
		System.out.print("\n "+new String(resultData));		
		
	}
}
