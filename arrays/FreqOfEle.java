package arrays;
import java.util.*;

public class FreqOfEle {

	public static void main(String[] args) {
		// Find frequency of elements in array
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many elements do you want in array : ");
		int n = sc.nextInt();
		
		int arr[] = new int[n];
		int freq[] = new int[n];
		boolean visited[] = new boolean[n];
		
		System.out.println("Enter array elements : ");
		for(int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i++)
		{
			if(visited[i])
			{
				continue;
			}
			
			int cnt = 1;
			for(int j = 1; j < n; j++)
			{
				if(arr[i] == arr[j])
				{
					cnt++;
					visited[j] = true;
				}
				
			}
			
			freq[i] = cnt;
		}
		
		System.out.println("Element - Frequency ");
		for(int i = 0; i < n; i++)
		{
			if(!visited[i])
			{
				System.out.println(arr[i] + " - " + freq[i]);
			}
			
		}
		
		sc.close();

	}

}