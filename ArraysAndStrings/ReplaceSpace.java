package ArraysAndStrings;

import java.util.Scanner;

public class ReplaceSpace {
	//Mr John Smith    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str= s.nextLine();
		String sarr[]= str.split(" ");
		//replaceSpaces(str.toCharArray(), str.trim().length());
		StringBuffer sb= new StringBuffer();
		for(int i=0;i<sarr.length-1;i++)
		{
			sb.append(sarr[i]+"%20");
		}
		sb.append(sarr[sarr.length-1]);
		
		System.out.println(sb);
	//	str=sb.toString();
	//	System.out.println(str.contains("John45"));
	}
	
/*static	void replaceSpaces(char[] str, int trueLength) {
		 int spaceCount = 0, index, i = 0;
		for (i = 0; i < trueLength; i++) {
		if (str[i] == ' ') {
		 spaceCount++;
}
		} 
		index = trueLength + spaceCount * 2;
		if (trueLength < str.length) str[trueLength] ='\0';
		for (i = trueLength - 1; i >= 0; i-- ) {
		if (str[i] == ' ') {
		str[index -1]= '0';
		str[index - 2] = '2';
		str[index - 3] = '%';
		 index = index - 3;
	} else {
	str[index - 1] = str[i];
		index--;
		}
		}
		System.out.println(str);
		 }
		*/
}
