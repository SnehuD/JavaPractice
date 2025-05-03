package loops;

import java.util.Scanner;

public class PrintChar {

	public static void main(String[] args) {
		// Print each character of a given string.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = sc.next();
		
		for(int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		sc.close();

	}

}
