package ArraysAndStrings;

import java.util.HashMap;
import java.util.Scanner;

public class UniqueCharacters {

	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.get(c) != null) {
				System.out.println("Not a unique string");
				System.exit(0);
			} else {
				map.put(c,1);
			}
		}
		System.out.print("Unique");
		
	}
}
