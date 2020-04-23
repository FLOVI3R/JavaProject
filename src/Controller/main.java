package Controller;
import java.util.Scanner;
import Operations.operations;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int res;
		System.out.println("- CALCULATOR -");
		System.out.println("\n1. ADD\n2. SUBSTRACT\n3. MULTIPLY\n4. DIVIDE\n0. EXIT");
		res = sc.nextInt();
		switch(res) {
			case 0: break;
			case 1: operations.add(); break;
			case 2: operations.substract(); break;
			case 3: operations.multiply(); break;
			case 4: operations.divide(); break;
			default: System.out.println("ERROR"); break;
		}
		sc.close();
	}

}
