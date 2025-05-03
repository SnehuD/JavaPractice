package loops;

import java.util.Scanner;

public class PrintCharRev {

	public static void main(String[] args) {
		// Print characters in reverse order of a string.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string : ");
		String str = sc.next();
		
		for(int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
		
		sc.close();

	}

}
