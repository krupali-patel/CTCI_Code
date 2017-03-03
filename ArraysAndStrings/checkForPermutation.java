package ArraysAndStrings;

import java.util.HashMap;

public class checkForPermutation {

	public static void main(String[] args) {

		checkForPermutation obj = new checkForPermutation();
		boolean result = obj.permutation("abca", "aabc");
		System.out.println(result ? "permutation" : "not a permutation");
	}

	public boolean permutation(String a, String b) {

		if (a.length() != b.length())
			return false;
		else {
			/*
			 * int letter[] = new int[256]; char[] a_charArray= a.toCharArray();
			 * for(char c: a_charArray) { letter[c]++; }
			 * 
			 * for(int i=0;i<b.length();i++) { if(--letter[b.charAt(i)] <0)
			 * return false; } return true;
			 */

			/*
			 * char c1[] = a.toCharArray(); char c2[]= b.toCharArray();
			 * Arrays.sort(c1); Arrays.sort(c2); return(Arrays.equals(c1,c2));
			 */

			if (a.length() != b.length())
				return false;
			else {
				char c1[] = a.toCharArray();
				char c2[] = b.toCharArray();
				HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
				HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

				for (int i = 0; i < c1.length; i++) {
					if (map1.containsKey(c1[i]))
						map1.put(c1[i], map1.get(c1[i]) + 1);
					else
						map1.put(c1[i], 1);
					if (map2.containsKey(c2[i]))
						map2.put(c2[i], map1.get(c2[i]) + 1);
					else
						map2.put(c2[i], 1);
				}
				if (map1.size() != map2.size())
					return false;
				else {
					for(Character key: map1.keySet())
						if(map2.containsKey(key))
							if(map2.get(key)!=map1.get(key))
								return false;
					}
				return true;
				}
			}
		}

	}

