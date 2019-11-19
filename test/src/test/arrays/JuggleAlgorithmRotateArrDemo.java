package test.arrays;

import javax.xml.transform.Templates;

public class JuggleAlgorithmRotateArrDemo {
	

	public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		
		int leftRotate=2;
		int size=arr.length;
		int gdc=GDC(size,leftRotate);
		int j=0,l= 0;
		
		for (int i = 0; i < gdc; i++) {
			j=i;
			l=i;
			while(true) {
				l=l+gdc;
				
				if(l>=size) { // reached to last position
					l=l-gdc;
					break;
				}
			}
			int temp=arr[j];
			arr[j]=arr[l];
			arr[l]=temp;
			System.out.println(": j :"+j+": l :"+l);
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.println("array data is:"+arr[i]);
		}
		
		
		

	}
	
	public static int GDC(int a, int b) {
		
		if(b==0) 
		{
			return a;
		}
		else {
			return GDC(b,a/b);
		}
	}

}
