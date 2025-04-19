package variablesDataTypesAndOperators;
import java.util.*;

public class AreaOfRect {

	public static void main(String[] args) {
		//Area of rectangle
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter length of a rectangle : ");
		float l = sc.nextFloat();
		
		System.out.println("Enter width of a rectangle : ");
		float w = sc.nextFloat();
		
		System.out.println("Length of rectangle is : " + l);
		System.out.println("Width of rectangle is : " + w);
		
		float area;
		area = l * w;
		
		System.out.println("Area of a rectangle is : " + area);
		
		sc.close();

	}

}
