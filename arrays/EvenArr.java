package arrays;

import java.util.Scanner;

public class EvenArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		//15
		
		int arr[] = new int[num];
		
		for (int i = 0; i < num; i++) { //0 1 2 3 .. 14
            arr[i] = i + 1;				//1 2 3 4.. 15
        }
		
        // Print even numbers
        for (int i = 0; i < num; i++) { //0 1
            if (arr[i] % 2 == 0)		// 2
                System.out.print(arr[i] + " ");
        }
		
		sc.close();

	}

}
