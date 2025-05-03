package conditionalsAndLoops;

import java.util.Scanner;

public class addOfNNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			//sum += i;
			sum = sum + i;
		}
		
		System.out.println(sum);
		
		sc.close();

	}

}
