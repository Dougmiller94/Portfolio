package Oddity;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
System.out.println(oddity(new int[] {1,4,5,7,9,11,12,16,17,21,27}));

	}

	public static List<Integer> oddity(int[] nums) {

		List<Integer> numList = new ArrayList<>();
		for (int numbers : nums) {
			if (numbers % 2 != 0) {
				numList.add(numbers);
			}

		}
		return numList;
	}
}


//comments - this is a solution to finding the odd numbers within a list by using an Arraylist, and finding the modulus of each number when dividing by 2.  If the answer is equal to zero
//remove the number from the list as it is even 