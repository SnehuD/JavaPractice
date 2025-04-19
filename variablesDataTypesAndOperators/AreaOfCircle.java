package variablesDataTypesAndOperators;
import java.util.*;

public class AreaOfCircle {

	public static void main(String[] args) {
		//Area of circle
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius of a circle : ");
		float r = sc.nextFloat();
		System.out.println("Radius is : " + r);
		
		double area;
		area = (r * r)*Math.PI;
		
		System.out.println("Area of a circle is : " + area);
		
		sc.close();

	}

}
