package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class StringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scanner.nextLine();
		System.out.println(s);
		List<String> list = checkByPattern(s);

	}

	private static List<String> checkByPattern(String s) {
		List<String> list = new ArrayList<String>();
		List<String> list1 = new ArrayList<String>();
		String [] ss = new String[] {"Hi", "Hello", "HelloWorld",  "HiTech", "HiGeek", "HiTechWorld", "HiTechCity", "HiTechLab" };
		list=Arrays.asList(ss);
		System.out.println(list);
		for(String ss1 : list) {
			String string1 = s;//our input
			String string2 = ss1;//iteration string
			int m = string1.length(); 
	        int n = string2.length();
	        boolean res = isSubSequence(string1, string2, m, n); 
	        if(res) {
	        	list1.add(string2);
	        }
		}

		System.out.println(list1);
		
		
		return list;
	}

	private static boolean isSubSequence(String str1, String str2, int m, int n) {
        if (m == 0)  
            return true; 
        if (n == 0)  
            return false; 
              
        // If last characters of two strings are matching 
        if (str1.charAt(m-1) == str2.charAt(n-1)) 
            return isSubSequence(str1, str2, m-1, n-1); 
  
        // If last characters are not matching 
        return isSubSequence(str1, str2, m, n-1); 
	}

}
