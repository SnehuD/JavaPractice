package conditionalsAndLoops;

import java.util.Scanner;

public class TableOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		System.out.println("Table of 2 is : ");
		
		for(int i = 1; i <= 10; i++) {
			//num = num * i;
			System.out.println(num + " * " + i + " = " + num * i);	//2 4 6 8 10.. 20
		}
		
		
		sc.close();

	}

}
