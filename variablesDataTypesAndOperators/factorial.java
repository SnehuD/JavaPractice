package variablesDataTypesAndOperators;
import java.util.*;

public class factorial {

	public static void main(String[] args) {
		// Factorial of a number
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num = sc.nextInt();
		
		if(num < 0)
		{
			System.out.println("Negative number doesnt have factorials");
		}
		else
		{
			int fact = 1;
			
            for (int i = 1; i <= num; i++) 
            {
            	fact = fact * i;
            }
            
            System.out.println("Factorial of " + num +" is " + fact);
		}
		
		sc.close();

	}

}
