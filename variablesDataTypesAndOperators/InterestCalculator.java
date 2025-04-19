package variablesDataTypesAndOperators;
import java.util.*;

public class InterestCalculator {

	public static void main(String[] args) {
		// Simple Interest and Compound Interest calculator
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Principal : ");
		double p = sc.nextDouble();
		
		System.out.println("Enter Rate : ");
		double r = sc.nextDouble();
		
		System.out.println("Enter Time : ");
		double t = sc.nextDouble();
		
		System.out.print("Enter number of times interest is compounded: ");
	    int num = sc.nextInt();
		
		System.out.println("Principal is : " + p);
		System.out.println("Interest Rate is : " + r);
		System.out.println("Time is : " + t);
		
		double si = ( p * r * t ) / 100;
		System.out.println("Simple Interest is : " + si);
		
		double ci = p * (Math.pow((1 + r / 100), t * num)) - p;
		System.out.println("Compound Interest is : " + ci);
		
		sc.close();

	}

}
