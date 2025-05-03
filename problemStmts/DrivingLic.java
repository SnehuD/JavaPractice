package problemStmts;

import java.util.Scanner;

public class DrivingLic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if age > 18 driving lic
		 * 		if learning permit 
		 * 			1=yes= elgl for driving test 
		 * 			0=no= first get learning lic
		 * else not elgbl
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		if(age > 18) {
			System.out.println("Eligible for driving licence");
			
			System.out.println("Do you have driving permit? (1 for Yes / 0 for No) : ");
			int dp = sc.nextInt();
			
			if(dp == 1) {
				System.out.println("Eligible for driving test");
			}
			else {
				System.out.println("First get learning licence");
			}
		}
		else {
			System.out.println("Not eligible for driving licence");
		}
		
		sc.close();

	}

}
