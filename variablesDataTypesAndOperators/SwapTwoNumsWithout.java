package variablesDataTypesAndOperators;
import java.util.*;

public class SwapTwoNumsWithout {
		//Swap two numbers (without third variable)

		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter two numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
			
		System.out.println("Before Swapping");
		System.out.println("Number 1 : " + n1);
		System.out.println("Number 2 : " + n2);
			
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
				
		System.out.println("After Swapping");
		System.out.println("Number 1 : " + n1);
		System.out.println("Number 2 : " + n2);
			
		sc.close();
			
		/*
			Output suppose n1 = 2 & n2 = 3
			n1 = n1 + n2  == 2+3 = 5
			n2 = n1 - n2  == 5-3 = 2
			n1 = n1 - n2  == 5-2 = 3
			now n1 = 3 & n2 = 2
		*/

		}

	}

