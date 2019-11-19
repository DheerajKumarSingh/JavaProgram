package test_newfeature;

public class TestFuctionDemo {
	public TestFuctionDemo() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFunctionalInterface dec=()->{System.out.println("Decorating with curtains");};
		dec.decorateWithCurtains();
		dec.decorateWithPaints();
		dec.anotherDefault();
	}

}
