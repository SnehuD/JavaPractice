package conditionalsAndLoops;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		// Fibonacci series up to N terms
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number you want Fibonacci series till : ");
		int n = sc.nextInt();
		
		System.out.println("Enter first term : ");
		int t1 = sc.nextInt();
		
		System.out.println("Enter second term : ");
		int t2 = sc.nextInt();
		
		for(int i = 1; i <= n; ++i)
		{
			System.out.print(t1 + ", ");
			int nt = t1 + t2;
			t1 = t2;
			t2 = nt;
		}
		
		/*
		 nt=t1+t2 == 0+1=1
		 t1=t2 == 0=1
		 t2=nt == 1=1
		 */
				
		sc.close();

	}

}
