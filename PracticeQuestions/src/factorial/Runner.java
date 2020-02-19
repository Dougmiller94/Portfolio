package factorial;

public class Runner {

	public static void main(String[] args) {

		System.out.println(factorials(10));
	}
	
	

	public static int factorials(int i) {

		int factorial = i;
		for (int j = i - 1; j > 0; j--) {
			factorial = factorial * j;
		}
		return factorial;
	}
}

this factorial question shows the factorial of an inputed number, by using a for loop 