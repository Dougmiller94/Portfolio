package borrowOrRob;

public class Runner {

	public static void main(String[] args) {
		
		System.out.println(palindrome ("Borrow or rob"));
		
		

	}
	
	public static boolean palindrome(String sentence) {
		
		String sen = sentence.replace(" ", "").toLowerCase();
		String reversedstring = "";
		for (int i=sen.length()-1; i>=0; i--) {
			reversedstring += sen.charAt(i);
		}
		System.out.println(reversedstring);
		return sen.contentEquals(reversedstring);
		}
		
	}



//1 step - ignore case 
//senetence = sentence.toLowercase();

//2 step - ignore spaces 
//(iteration) > check for space > else add letter to new string.

//or use sentence.remove(); 


//3 step cheek if forward is the same back

