package uddl.test.stubs;

public class TestMethodName {
	
	public static void main(String[] args) {
		method1();
	}
	
	private static void method1(){
		System.out.println("This is method1") ;
		System.out.println(" ## " + getCurrentMethodName());
	}
	
	private static String getCurrentMethodName(){
		StackTraceElement stackTraceElements[] = (new Throwable()).getStackTrace();
		System.out.println("$$ " + stackTraceElements[1].toString() );
		return stackTraceElements[1].toString();
		
	}

}
