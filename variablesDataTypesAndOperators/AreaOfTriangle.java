package variablesDataTypesAndOperators;
import java.util.*;

public class AreaOfTriangle {

	public static void main(String[] args) {
		//Area of Triangle
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Base of a Triangle : ");
		float b = sc.nextFloat();
		
		System.out.println("Enter Height of a Triangle : ");
		float h = sc.nextFloat();
		
		System.out.println("Base of a Trangle \t : " + b);
		System.out.println("Height of a Trangle \t : " + h);
		
		float area = ( b * h ) / 2;
		System.out.println("Area of given Triangle is : " + area);
		
		sc.close();
		
	}

}
