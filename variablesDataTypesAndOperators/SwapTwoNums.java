package variablesDataTypesAndOperators;
import java.util.*;

public class SwapTwoNums {
	
	//Swap two numbers (with third variable)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		System.out.println("Before Swapping");
		System.out.println("Number 1 : " + n1);
		System.out.println("Number 2 : " + n2);
		
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		System.out.println("After Swapping");
		System.out.println("Number 1 : " + n1);
		System.out.println("Number 2 : " + n2);
		
		sc.close();

	}

}
