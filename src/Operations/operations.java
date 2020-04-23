package Operations;
import java.util.Scanner;

public class operations {
	public static void add() {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		System.out.println("\nFirst number: ");
		n1 = sc.nextInt();
		System.out.println("\nSecond number: ");
		n2 = sc.nextInt();
		System.out.printf("%d + %d = %d\\n",n1, n2, n1 + n2);
		sc.close();
	}
	
	public static void substract() {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("\nFirst number: ");
		n1 = sc.nextInt();
		System.out.println("\nSecond number: ");
		n2 = sc.nextInt();
		System.out.printf("%d - %d = %d\\n",n1, n2, n1 - n2);
		sc.close();
	}
	
	public static void multiply() {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("\nFirst number: ");
		n1 = sc.nextInt();
		System.out.println("\nSecond number: ");
		n2 = sc.nextInt();
		System.out.printf("%d * %d = %d\\n",n1, n2, n1 * n2);
		sc.close();
	}
	
	public static void divide() {
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("\nFirst number: ");
		n1 = sc.nextInt();
		System.out.println("\nSecond number: ");
		n2 = sc.nextInt();
		System.out.printf("%d / %d = %d\\n",n1, n2, n1 / n2);
		sc.close();
	}
}
