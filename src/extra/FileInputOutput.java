package extra;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FileInputOutput {
	
	public static void main(String[] args) {
		String filepath = "/home/nils/Desktop/numbers.txt";
		
		List<Integer> numbers = new ArrayList<>();
		try {
			Scanner scanner = new Scanner(new FileReader(filepath));
			while(scanner.hasNext()) {
				if(scanner.hasNextInt()) {
					numbers.add(scanner.nextInt());
				}
				else {
					System.out.println(scanner.hasNext() + " is not an integer");
				}
			}
			scanner.close();
			
			Collections.sort(numbers);
			
			PrintWriter writer = new PrintWriter(filepath);
			for(int number : numbers) {
				writer.println(number);
			}
			writer.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("Could not find file " + filepath);
		}
	}

}
