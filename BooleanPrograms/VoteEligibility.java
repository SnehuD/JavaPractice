package BooleanPrograms;

import java.util.Scanner;

public class VoteEligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		boolean isEligible = true;
		if(age >= 18) {
			isEligible = true;
		} else {
			isEligible = false;
		}
		
		//System.out.println("Value of isEligible is : " + isEligible);
		if(isEligible == true) {
			System.out.println("Eligible for voting");
		} else {
			System.out.println("Not Eligible for voting");
		}
		
		boolean iamFalse = true;
		iamFalse = false;
		System.out.println(!iamFalse == true ? "true" : "false");

		if(isEligible) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
		/*
		 !true == true	-> false
		 true != !true  -> true
		 !false != !true -> true ====  true != false  -> true
		 */
		
		sc.close();

	}

}
