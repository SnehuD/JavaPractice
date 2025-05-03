package conditionalsAndLoops;

import java.util.Scanner;

public class PrimeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		System.out.println("Prime numbers are");
		
		for(int i = 2; i <= num; i++) 
		{
			boolean isPrime = true; 
			
			System.out.println("i = " + i);
			
			for(int j = 2; j <= i / 2; j++) // trace for 17 
			{	
				System.out.println("j = " + j);	// 2 3 
				
				if(i % j == 0) //7%3 = 0 no
				{
					isPrime = false;
					break;	
				} 	
			}
			
			if(isPrime) 
			{
				System.out.print(i + "\t"); 	//2 3 
			}
		}
		
		sc.close();

	}

}
