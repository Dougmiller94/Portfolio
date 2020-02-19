package uniqueLetters;

import java.util.Arrays;
import java.util.stream.Collectors;

public class rafMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public String uniqueletters(String sentence) {
		return Arrays.asList(sentence.split("")).stream().distinct().collect(Collectors.joining(""));
				
	}

}
