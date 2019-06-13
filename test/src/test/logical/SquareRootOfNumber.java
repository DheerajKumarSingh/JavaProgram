package test.logical;

public class SquareRootOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// using newtons mathematical calculation here x2=y i.e. x*x=y
		
       findSquareRootOfNumber(9.4);
	}

	
	public static void findSquareRootOfNumber(double d)
	{
		float root = 0.0f;
	    float square = 0.0f;
	    while (square < d) {
	        float precision = 0.1f;
	        root=root+precision;
	      root++;
	      square = root * root;
	    }
         
         System.out.print("result :"+root);
	}
}
