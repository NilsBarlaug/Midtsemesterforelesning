package extra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class UserInputOutput {
	
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("List the numbers you would like to be sorted and write stop");
		while(scanner.hasNext()) {
			if(scanner.hasNextInt()) {
				numbers.add(scanner.nextInt());
			}
			else {
				String word = scanner.next();
				if(word.equals("stop")) {
					break;
				}
				else {
					System.out.println("I don't know what " + word + " means!");
				}
			}
		}
		Collections.sort(numbers);
		System.out.println("Sorted: " + numbers);
	}

}
