package basicSyntaxAndOutputs;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a week day : ");
		String day = sc.next();
		
		System.out.println(day);
		
		if(day == "sunday" || day == "saturday") {
			System.out.println("Holiday");
		} else {
			System.out.println("Workdays");
		}
		
		
		sc.close();

	}

}
