package problemStmts;

import java.util.Scanner;

public class EntryFees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * take ip from user(age) 
		 * check age < 5 free entry for child
		 * age < 18 5rs fees
		 * age < 18 && clg id yes or no (String) 
		 * if yes 1= student discount & fees=3   No 0= 5rs
		 * 
		 * age<60 10rs ticket
		 * else 8rs
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		if(age < 5) {
			System.out.println("Free entry for child");
		} 
		
		else if(age < 18) {
			System.out.println("5 RS entry fees");
			
			System.out.println("Do you have clg ID ? (1 for Yes / 0 for No) ");
			int id = sc.nextInt();
			if(id == 1) {
				System.out.println("You got discount \n3 Rs entry fees");
			}
			else {
				System.out.println("5 RS entry fees");
			}
		}
		
		else if(age < 60) {
			System.out.println("10 RS entry fees");
		}
		
		else{
			System.out.println("8 RS entry fees");
		}
		
		
		sc.close();

	}

}
