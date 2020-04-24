package Model;
import java.util.Scanner;
import Operations.operations;

public class model {
	public static void options() {
		Scanner sc = new Scanner(System.in);
		int res, n1, n2;
		System.out.println("n1: ");
		n1 = sc.nextInt();
		System.out.println("n2: ");
		n2 = sc.nextInt();
		System.out.println("\n1. ADD\n2. SUBSTRACT\n3. MULTIPLY\n4. DIVIDE\n0. EXIT");
		res = sc.nextInt();
		switch(res) {
			case 0: break;
			case 1: operations.add(n1, n2); break;
			case 2: operations.substract(n1, n2); break;
			case 3: operations.multiply(n1, n2); break;
			case 4: operations.divide(n1, n2); break;
			default: System.out.println("ERROR"); break;
		}
		sc.close();
	}

}
