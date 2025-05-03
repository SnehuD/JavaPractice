package loops;

import java.util.Scanner;

public class PrintNumUptoN {

	public static void main(String[] args) {
		// Take a number input and print all numbers from 1 to that number.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
