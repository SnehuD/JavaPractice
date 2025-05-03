package loops;

import java.util.Scanner;

public class PrintNums {

	public static void main(String[] args) {
		// Print numbers from 1 to 20.
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= 20; i++) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
