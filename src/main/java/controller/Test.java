package controller;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {

		
		/*
		 * Push all zeros to right in an array
		 * ​Input:  arr[]={3,0,1,5,0,5}
		   Output: arr[]={3,1,5,5,0,0}
		 */
		
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        System.out.println("Array before pushing zeros to the back: " + Arrays.toString(arr));
		pushZerostoRight(arr);
		System.out.println("Array after pushing zeros to the back: " +  Arrays.toString(arr));
        
	
		
		/*
		 * We have to check n = 19 1 + 9 = 10 1 + 0 = 1	.... if 1 its magic Number
		 */
		System.out.println("");
		int n = 12345;
		magicNumber(n);
		magicNumber1(n);
	}

	private static void magicNumber1(int n) {
		int sumOfDigits=0;
		while(n>0 || sumOfDigits > 9) {
			
			if (n == 0) {
                n = sumOfDigits;
                sumOfDigits = 0;
            }
			
			sumOfDigits = sumOfDigits + (n % 10);
            n = n / 10;
		}
		if(sumOfDigits ==1)
			System.out.println("Its a Magic Number");
		else
			System.out.println("its not a Magic Number");
		}
		
	

	private static void pushZerostoRight(int[] arr) {
		int count=0;
		
		//setting non zero values to the int array
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arr[count++]=arr[i];
            }
        }
        //zero count filling with 0 value
        for(int j=count;j<arr.length;j++)
        {
            arr[count++]=0;
        }		
	}

	private static void magicNumber(int n) {
		
		String number = String.valueOf(n);
		char[] character = number.toCharArray();
		int sum = 0;
		for(char ch:character) {
			String b = String.valueOf(ch);
			int a = Integer.valueOf(b);
			sum = sum+a;
			
		}
		String s= String.valueOf(sum);
		
		
		if(s.length()==1) {
		if(sum ==1)
			System.out.println(n +" is a Magic Number");
		else
			System.out.println(n +" is not a Magic Number");
		}
		else {
			magicNumber(sum);
		}

			

	}

}
