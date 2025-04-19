package conditionalsAndLoops;
import java.util.*;

public class PrimeNo {

	public static void main(String[] args) {
		// Check if a number is prime
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		boolean isPrime = false;
		
		if(n == 0 || n == 1)
		{
			isPrime = true;
		}

		for(int i = 2; i <= n / 2; ++i)
		{
			if(n % i == 0)
			{
				isPrime = true;
				break;
			}
			
		}
		
		if(!isPrime)
		{
			System.out.println("Its a Prime Number");
		}
		else
		{
			System.out.println("Its not a Prime Number");
		}
		
		sc.close();

	}

}
