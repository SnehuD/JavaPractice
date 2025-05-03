package problemStmts;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * take marks from usr
		 * if marks >= 90 A
		 * if >=80 B
		 * if ...... 60 ...
		 * else fail
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your marks : ");
		int m = sc.nextInt();
		
		if(m >= 90) {
			System.out.println("A Grade");
		}
		else if(m >= 80) {
			System.out.println("B Grade");
		}
		else if(m >= 70) {
			System.out.println("C Grade");
		}
		else if(m >= 60) {
			System.out.println("D Grade");
		}
		else {
			System.out.println("Fail");
		}
		
		sc.close();

	}

}
