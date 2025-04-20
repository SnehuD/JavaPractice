package arrays;
import java.util.*;

public class SortArr {

	public static void main(String[] args) {
		// Sort array in ascending and descending order
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many element do you want in array : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		System.out.println("Enter array elements : ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n-1; i++)
		{
			for(int j = i+1; j < n; j++)
			{
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Ascending order : ");
		for(int i = 0; i < n; i++)
		{
			System.out.println(arr[i] + " ");
		}
		
		System.out.println("Descending order : ");
		for(int i = n-1; i >= 0; i--)
		{
			System.out.println(arr[i] + " ");
		}
		  
		sc.close();
		        
	}

}
