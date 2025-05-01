package conditionalsAndLoops;

import java.util.Scanner;

public class DivBy5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n1 = sc.nextInt();
		
		if(n1 == 0) {
			System.out.println("Cannot determine");
		}
		else if(n1 % 5 == 0) {
			System.out.println("Number is Divisible by 5");
		}
		else {
			System.out.println("Number is not divisible by 5");
		}
	}
}
