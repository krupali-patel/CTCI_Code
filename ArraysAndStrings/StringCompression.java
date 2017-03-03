package ArraysAndStrings;

import java.util.HashMap;
import java.util.Scanner;

public class StringCompression {
	public static void main(String[] args) {
		//aabcccccaaa
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
//		int j=0,k=0;
	//	char letter[] = new char[str.length()];
	//	int occurence[] = new int[str.length()];
		/*for (int i = 0; i < str.length(); i++) {
			char key=str.charAt(i);
			j=i;
			int count=0;
			while(j<str.length() && str.charAt(j)==key)
			{
			count++;
			j++;
			}
			i=--j;
			letter[k]=key;
			occurence[k]=count;
			k++;
		}
	StringBuffer sb = new StringBuffer();
	int i=0;
	while((int)letter[i]!=0)
	{
		sb.append(letter[i]);
		sb.append(occurence[i]);
		i++;
	}*/
	char key=str.charAt(0);
	int count=1;
	StringBuffer sb = new StringBuffer();
		for(int i=1;i<str.length();i++)
		{
			
			if(key==str.charAt(i))
			{
				count++;
			}
			else
			{
				sb.append(key);
				sb.append(count);
				key=str.charAt(i);
				count=1;
			}
			
		}
		
		sb.append(key);
		sb.append(count);
		if(sb.length()<str.length())
			System.out.println(sb);
		else
			System.out.println(str);
	}
}
