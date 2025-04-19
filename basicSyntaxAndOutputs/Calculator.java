package basicSyntaxAndOutputs;
import java.util.*;

public class Calculator {

	public static void main(String[] args) {
		//Simple calculator (add, subtract, multiply, divide)
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Two numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("Number 1 : " + n1);
		System.out.println("Number 2 : " + n2);
		System.out.println();
		
		int add = n1 + n2;
		int sub = n1 - n2;
		int mul = n1 * n2;
		int div = n1 / n2;
		int mod = n1 % n2;
		
		System.out.println("Addition of given two numbers is\t : " + add);
		System.out.println("Subtration of given two numbers is\t : " + sub);
		System.out.println("Multiplication of given two numbers is\t : " + mul);
		System.out.println("Division of given two numbers is\t : " + div);
		System.out.println("Modulus of given two numbers is\t\t : " + mod);
		
		sc.close();

	}

}
