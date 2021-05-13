package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;


public class ATM {

	static int total = 0;
	public static void main(String[] args) {

		System.out.println("Welcome to ATM");
		
		/* Denominations */
		Set<Integer> denominations = new LinkedHashSet<>(Arrays.asList(20,10,5,1));
		/* method to form hashmap*/
		LinkedHashMap<Integer, Integer> map = hashMapFormation();
		/* printing the hashmap and Total*/
		printHashMapAndTotal(map);
		/*Deposot or Withdraw */
		callDepositOrWithdraw(denominations,map);	
	}

	public static void deposit(int total, Set<Integer> denominations, LinkedHashMap<Integer, Integer> map) {
	
		System.out.println("Deposit: ");

		int totalEnteredAmount = 0;
		for (Integer denomination : denominations) {
			System.out.println("Enter " + denomination + " Rs : ");
			Scanner rupeeCount = new Scanner(System.in);
			Integer enteredRupeeCount = rupeeCount.nextInt();
				Integer mapOneRupeeCount = map.get(denomination);
				Integer totalRupeeCount = mapOneRupeeCount + enteredRupeeCount;
				map.put(denomination, totalRupeeCount);
				totalEnteredAmount = totalEnteredAmount + (denomination * totalRupeeCount);
		}
		total = totalEnteredAmount+total;
		printHashMapAndTotal(map);
		callDepositOrWithdraw(denominations,map);
	}
	
	
	public static void withdraw(int total, Set<Integer> denominations, LinkedHashMap<Integer, Integer> map) {

		Map<Integer, Integer> beforeWithdraw = new LinkedHashMap<>();
		beforeWithdraw.putAll(map);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Amount to Withdraw : ");
		Integer input = scanner.nextInt();
		if (input == 0 || input < 0) {
			System.out.println("Incorrect or insufficient funds ");

		} else {
			boolean flag = false;
			int counter = 0;
			if (total >= input) {
				
				withdrawLogic(denominations, map, beforeWithdraw, input, flag, counter);

			} else {
				System.out.println("Incorrect or insufficient funds ");
				callDepositOrWithdraw(denominations, map);
			}
		}

	}

	private static void withdrawLogic(Set<Integer> denominations, LinkedHashMap<Integer, Integer> map,
			Map<Integer, Integer> beforeWithdraw, Integer input, boolean flag, int counter) {
		for (Integer denomination : denominations) {
			counter++;
			if (input >= denomination) {
				int balance = input % denomination;
				int reminder = input / denomination;
				int currentValue = map.get(denomination);
				int lastIndex = denominations.size();
				if (counter != lastIndex) {
					if (currentValue < reminder) {
						balance = balance + denomination * (reminder - currentValue);
						reminder = currentValue;
					}
				}
				input = balance;
				if (currentValue <= 0) {
					flag = true;
					System.out.println("Requested withdraw amount is not dispensable ");
					System.out.println("Note: At this stage, the ATM has only " + numberToWord(currentValue) + " " + denomination
							+ " dollar bills. So, the withdrawal amount cannot be dispensed.");
					break;
				}
				int d = currentValue - reminder;
				if (d != 0 && d < 0) {
					flag = true;
					System.out.println("Requested withdraw amount is not dispensable ");
					System.out.println("Note: At this stage, the ATM has only " + numberToWord(currentValue) + " " + denomination
							+ " dollar bills. So, the withdrawal amount cannot be dispensed.");
					break;
				} else {
					map.put(denomination, d);
				}
			}

		}
		if (!flag)
			printDispensedMap(beforeWithdraw,map);
			printHashMapAndTotal(map);
		if (flag) {

		}
	}
	
	private static void printDispensedMap(Map<Integer, Integer> previous, LinkedHashMap<Integer, Integer> map2) {
		System.out.print("Dispensed: ");
		Collection<Integer> values = previous.values();
		Integer[] a = values.toArray(new Integer[0]);
		Collection<Integer> values1 = map2.values();
		Integer[] b = values1.toArray(new Integer[0]);
		List<Integer> ouput = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (i == j) {
					ouput.add(a[i] - b[j]);
				}
			}
		}
		int k = -1;
		for (Entry<Integer, Integer> entry : previous.entrySet()) {
			k++;
			previous.put(entry.getKey(), ouput.get(k));
		}
		System.out.println(" ");
		Iterator<Map.Entry<Integer, Integer>> i = previous.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry<Integer, Integer> entry = i.next();
			if (entry.getValue() == 0) {
				i.remove();
			}
		}
		for (Entry<Integer, Integer> entry : previous.entrySet()) {
			System.out.print(entry.getKey() + "Rs : " + entry.getValue() + "  ");
		}
		System.out.println(" ");
	}

	private static void printHashMapAndTotal(Map<Integer, Integer> intialRupeesCount) {

		total =0;
		System.out.println("Balance: ");

		for(Entry<Integer, Integer> entry : intialRupeesCount.entrySet()) {
			System.out.print(entry.getKey()  + "Rs : " + entry.getValue() + "  ");
			total = total + (entry.getKey() * entry.getValue());
		}
		System.out.println(" ");
	  	System.out.println("Total : " + total);	  	
	}

	private static LinkedHashMap<Integer, Integer> hashMapFormation() {
		LinkedHashMap<Integer, Integer> initialHashMap = new  LinkedHashMap<Integer, Integer>();
		initialHashMap.put(20, 0);
		initialHashMap.put(10, 0);
		initialHashMap.put(5, 0);
		initialHashMap.put(1, 0);
		return initialHashMap;
	}

	public static void callDepositOrWithdraw(Set<Integer> denominations, LinkedHashMap<Integer, Integer> map) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1 for Deposit and 2 for Withdraw : ");
		String input = scanner.nextLine();
		switch (input) {

		case "1":
			deposit(total,denominations,map);
			break;

		case "2":
			withdraw(total,denominations,map);
			break;
		}	
	}
	
	private static String numberToWord(int number) {
        // variable to hold string representation of number 
        String words = "";
        String unitsArray[] = { "zero", "one", "two", "three", "four", "five", "six", 
                      "seven", "eight", "nine", "ten", "eleven", "twelve",
                      "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", 
                      "eighteen", "nineteen" };
	String tensArray[] = { "zero", "ten", "twenty", "thirty", "forty", "fifty",
                      "sixty", "seventy", "eighty", "ninety" };
 
	if (number == 0) {
	    return "zero";
	}
	// add minus before conversion if the number is less than 0
	if (number < 0) { 
           // convert the number to a string
           String numberStr = "" + number; 
           // remove minus before the number 
           numberStr = numberStr.substring(1); 
           // add minus before the number and convert the rest of number 
           return "minus " + numberToWord(Integer.parseInt(numberStr)); 
        } 
        // check if number is divisible by 1 million
        if ((number / 1000000) > 0) {
	   words += numberToWord(number / 1000000) + " million ";
	   number %= 1000000;
	}
	// check if number is divisible by 1 thousand
	if ((number / 1000) > 0) {
	    words += numberToWord(number / 1000) + " thousand ";
	    number %= 1000;
	}
	// check if number is divisible by 1 hundred
	if ((number / 100) > 0) {
	     words += numberToWord(number / 100) + " hundred ";
	     number %= 100;
	}
 
	if (number > 0) {
	     // check if number is within teens
	     if (number < 20) { 
                    // fetch the appropriate value from unit array
                    words += unitsArray[number];
             } else { 
                // fetch the appropriate value from tens array
                words += tensArray[number / 10]; 
                if ((number % 10) > 0) {
		    words += "-" + unitsArray[number % 10];
                }  
	     }
          }
	
	  return words;
   }
	
}


