package Practice;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Input : My Name Is
		 * Output : Is Name My
		 */

		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the string :");
		String input = scanner.nextLine();
		String output = " " ;
		
		String[] split = input.split(" ");
//		for (String a : split) {
//			System.out.println(split.length);
//			System.out.println(a.toString());
//
//		}
		for (int a=split.length-1; a>=0; a--) {
			output = output +  split[a] ;
			output = output +" ";
		}
		System.out.println(output.toString());
		
	}

}
