package string;

public class StringTest {

	public StringTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String s1=new String("you can not change me"); String s2=new
		 * String("you can not change me"); System.out.print(""+s1==s2);
		 * 
		 * String s3="you can not change me"; String s4="you can not change me";
		 * 
		 * System.out.print("\n"+s1.equals(s4)+"\n"); System.out.print("\n"+s1==s3);
		 * 
		 * String s5=s1.intern();
		 * 
		 * 
		 * System.out.print("\n"+s5==s3);
		 */
		
		String s1= "rahul";
		String s2=new String ("rahul").intern();
		System.out.println((s1==s2));
		System.out.println(s2.equals(s2));

	}

}
