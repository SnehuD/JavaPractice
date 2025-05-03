package basicSyntaxAndOutputs;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 9;
		
		if(n % 2 == 0) {
			System.out.println("even number");
			
			if(n > 2 && n < 5) {
				System.out.println("Hello");
			}
			else if(n > 6 && n < 8) {
				System.out.println("Bye");
			}
		} else {
			System.out.println("Odd Number");
		}
		
	}

}
