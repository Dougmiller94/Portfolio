package uniqueLetters;

import java.util.LinkedHashSet;
import java.util.Set;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String uniqueletters(String sentence) {
		Set<Character>uniqueletterList = new LinkedHashSet<Character>();
		String uniqueletters = "";
		for (int i = 0; i<sentence.length(); i++) {
			uniqueletterList.add(sentence.charAt(i));
		}
		for (char c : uniqueletterList) {
			uniqueletters = uniqueletters +  c;
		}
		return uniqueletters;
	}
}
