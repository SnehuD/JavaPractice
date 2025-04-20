package arrays;
import java.util.*;

public class MergeArr {

	public static void main(String[] args) {
		// Merge two arrays
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements do you want in first array : ");
		int a = sc.nextInt();
		
		int arr[] = new int[a];
		
		System.out.println("Enter the array elements : ");
		for(int i = 0; i < a; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println("How many elements do you want in second array : ");
		int b = sc.nextInt();
		
		int array[] = new int[b];
		
		System.out.println("Enter the array elements : ");
		for(int i = 0; i < b; i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("Merge array : ");
		int c[] = new int[a + b];
		for(int i = 0; i < a; i++)
		{
			c[i] = arr[i];
		}
		for(int i = 0; i < b; i++)
		{
			c[a + i] = array[i];
		}
		
		for(int i = 0; i < c.length; i++)
		{
			System.out.print(c[i] + " ");
		}
		
		sc.close();

	}

}
