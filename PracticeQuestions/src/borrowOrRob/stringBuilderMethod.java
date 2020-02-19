package borrowOrRob;

public class stringBuilderMethod {

	public static void main(String[] args) {
		
		System.out.println(palindrome ("Borrow or rob"));
		

	}
	
	
	
	public static boolean palindrome(StringBuilder sentence) {
		
		StringBuilder stringBuilder = sentence.replace(" ", "").toLowerCase();
		stringBuilder = new StringBuilder();
		stringBuilder.append(sentence);
		stringBuilder.reverse();
		System.out.println(stringBuilder);
		return sen.equals(stringBuilder.toString());
		}
}