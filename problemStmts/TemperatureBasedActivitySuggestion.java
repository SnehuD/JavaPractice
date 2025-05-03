package problemStmts;

import java.util.Scanner;

public class TemperatureBasedActivitySuggestion {

	public static void main(String[] args) {
		//Temperature-Based Activity Suggestion
		
		/*
		 * Given a temperature input in Celsius, suggest an activity:
		 * 30°C: “It’s hot, stay indoors.”
		 * 20–30°C: “Nice weather, go for a walk.”
		 * 10–19°C: “A bit chilly, wear a jacket.”
		 * <10°C: “Too cold, stay warm indoors.”
		 */

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Give temperature input in Celcius : ");
		int temp = sc.nextInt();
		
		if(temp > 30) {
			System.out.println("Its hot, stay indoors.");
		}
		else if(temp > 20) {
			System.out.println("Nice weather, go for a walk.");
		}
		else if(temp > 10) {
			System.out.println("A bit chilly, wear a jacket.");
		}
		else {
			System.out.println("Too cold, stay warm indoors.");
		}
		
		sc.close();
	}

}
