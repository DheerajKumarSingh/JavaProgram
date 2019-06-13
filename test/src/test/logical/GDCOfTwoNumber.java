package test.logical;

public class GDCOfTwoNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=60;
		int b=36;
		System.out.print(gcd(a,b));
	//	GDCNumber(a,b);
		//GDCWithoutRecursion();

	}
	
	public static void GDCWithoutRecursion()
	{}
	
	
	
	
	
	
	
	
	
	
	
	
	
	// Recursive function to return gcd of a and b 
    static int gcd(int a, int b) 
    { 
        // Everything divides 0  
        if (a == 0) 
          return b; 
        if (b == 0) 
          return a; 
       
        // base case 
        if (a == b) 
            return a; 
       
        // a is greater 
        if (a > b) 
            return gcd(a-b, b); 
        return gcd(a, b-a); 
    } 
	
	
	
	public static int GDCNumber(int a, int b) {
		
		 if (b == 0) {
			 //System.out.print("\nb is zero"+a);
		        return a; 
		 }
		        else {
		        int data=GDCNumber(b, a % b); // swap value a=b & b=a%b
		        System.out.print(" \n b: "+b+" a  "+a+"%"+" b "+b+"=="+a%b);
		      return data; 
		        }
	}

}
