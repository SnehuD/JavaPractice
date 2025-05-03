package practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of a & b : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a + b;
		int sub = a - b;
		int mul = a * b;
		int div = a / b;
		int mod = a % b;
		
		
		System.out.println("Addition of " + a +" and " + b + " is " + sum);
		System.out.println("Subtraction of " + a +" and " + b + " is " + sub);
		System.out.println("Multiplication of " + a +" and " + b + " is " + mul);
		System.out.println("Division of " + a +" and " + b + " is " + div);
		System.out.println("Modulus of " + a +" and " + b + " is " + mod);
		
		sc.close();

	}

}
