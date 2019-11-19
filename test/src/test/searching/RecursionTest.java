package test.searching;

public class RecursionTest {

	public RecursionTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.print(""+0%5);
        	mergeSort(0,5);
		//callRecursive(5);

	}
	
	
	public static void callRecursive(int i) {
		
		
		if(i>0) {
			i--;
			System.out.println("before first callrecursive"+i);
			callRecursive(i);
			System.out.println("after first callrecursive"+i);
			callRecursive(i);
			System.out.println("after second callrecursive"+i);
			
		}
		
	}

	
	
	
	  public static void mergeSort(int start,int end) {
		  
		  int mid=(start+end)/2;
	  
	  if(start<end) { // Sort left half
	  System.out.println("before first merge "+" start:"+start+":mid:"+mid);
	  
	  mergeSort(start,mid);
	  System.out.println("after first merge "+" start:"+start+":mid:"+mid);
	  // Sortright half
	  mergeSort(mid+1,end);
	  System.out.println("after second merge "+" start:"+start+":mid:"+mid);
	  //Merge left and right half //
	  System.out.println(":::::::before merge is called times::::::"+"start:"+ start+" :mid:"+mid+": end:"+end);
	  // merge(start,mid,end); }
	  
	  }
	  }
	 

}
