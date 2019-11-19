package test_newfeature;

@FunctionalInterface
public interface MyFunctionalInterface {
	
	// one abstract method
	 void decorateWithCurtains();
 default void anotherDefault() {
	 System.out.println("Decorating using anotherDefault"); 
 }	 
	 // default method
	 default void decorateWithPaints()
	 {
	  System.out.println("Decorating using paints");
	 }
	 
	 // Overriding method of java.lang.Object
	 @Override
	 public int hashCode();

}
