package variablesDataTypesAndOperators;
import java.util.*;

public class PositiveNegative {

	public static void main(String[] args) {
		// Check positive, negative or zero
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		System.out.println("Entered number is : " + num);
		
		if(num == 0) 
		{
			System.out.println("Enter number is 0");
		}
		else if(num > 0)
		{
			System.out.println("Entered number is a positive number");
		}
		else
		{
			System.out.println("Entered number is a negative number");
		}

		sc.close();

	}

}
