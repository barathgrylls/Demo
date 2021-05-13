package Practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		System.out.println();
	
		String a ="Barath";
		String b ="th2araB";
		
		int c = a.length();
		int d = b.length();
		
		if(c!=d) {
			System.out.println("Not an Anagram");
		}else {
			
			char charArray[] = a.toCharArray();
			char charArray1[] = b.toCharArray();
		      Arrays.sort(charArray);
		      Arrays.sort(charArray1);

		      System.out.println(new String(charArray).equals(new String(charArray1)));
				System.out.println(" Anagram");

		    
			
		}
	}

}
