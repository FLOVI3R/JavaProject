package Operations;

public class operations {
	
	public static int add(int n1, int n2) {
		System.out.printf("%d + %d = %d",n1, n2, n1 + n2);
		return n1 + n2;
	}
	
	public static int substract(int n1, int n2) {
		System.out.printf("%d - %d = %d",n1, n2, n1 - n2);
		return n1 - n2;
	}
	
	public static int multiply(int n1, int n2) {
		System.out.printf("%d * %d = %d",n1, n2, n1 * n2);
		return n1 * n2;
	}
	
	public static int divide(int n1, int n2) {
		System.out.printf("%d / %d = %d",n1, n2, n1 / n2);
		return n1 / n2;
	}
}
