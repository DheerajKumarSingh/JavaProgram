package test.arrays;

public class JuggleAlgoRotateArray {

	public JuggleAlgoRotateArray() {
	}
	
	public static void leftRotateData(int arr[],int d,int n) {
		
		int i, j, k, temp; 
        int gdc = GDC(d, n); 
        
        for (i = 0; i < gdc; i++) { 
        	
            /* move i-th values of blocks */
        	
            temp = arr[i]; 
            j = i; 
            
            while (true) { 
                k = j + d; 
                if (k >= n) 
                    k = k - n; 
                if (k == i) 
                    break; 
                System.out.println("j:"+j+": k:"+k+": n:"+n+" :d :"+d);
                arr[j] = arr[k]; 
                j = k; 
            }
            
            arr[j] = temp; 
        }
        
        for (int l = 0; l < arr.length; l++) {
        	 System.out.println(arr[l]);
		}
       
	}

 static int GDC(int a, int b) {
		if(b==0) {
			return a;
		}
		else {
		return GDC(b,( a % b));
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int size=arr.length;
		int gdc=GDC(size,3);
		leftRotateData(arr,3,size);
		/* System.out.println("\n GDC of two number is :"+gdc); */
	}
}
