package arrays;

import java.util.Scanner;

public class PrintArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements do you want in array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] +" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*System.out.println("How many element do you want in array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter array elements : ");

        // input elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // print array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }*/
		
		
		sc.close();
	}

}
