package practice;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		boolean isPrime = true;
		
		for(int i = 2; i <= num / 2; i++) {
			if(num %  i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("Its a Prime number");
		} else {
			System.out.println("Its not a Prime number");
		}
		
		sc.close();

	}

}
