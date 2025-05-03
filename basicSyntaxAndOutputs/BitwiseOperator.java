package basicSyntaxAndOutputs;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println("Number is divisible by 3 and 5");
		} else if(num % 3 == 0) {
			System.out.println("Number is divisible by 3");
		} else if(num % 5 == 0) {
			System.out.println("Number is divisible by 5");
		}
		
		
		sc.close();
	}

}
