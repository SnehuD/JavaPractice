package conditionalsAndLoops;
import java.util.*;

public class PrimeNo {

	public static void main(String[] args) {
		// Check if a number is prime
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		boolean isPrime = true;
		for(int i = 2; i <= num / 2; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			} 
			
		}	//
		
		if(isPrime) {
			System.out.println("Its a prime number");
		} else {
			System.out.println("Its not a prime number");
		}
		
		sc.close();

	}

}
