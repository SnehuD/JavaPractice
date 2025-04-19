package variablesDataTypesAndOperators;
import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		// Check even or odd number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Its an Even number");
		}
		else
		{
			System.out.println("Its an Odd number");
		}

		sc.close();
	}

}
