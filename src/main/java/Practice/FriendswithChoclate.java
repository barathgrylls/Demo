package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class FriendswithChoclate {
	
	public static void  main(String args[]) {
				
		int friendsCount = 5;
		int choclateCount = 25;
		
		List<Integer> firstRound = new ArrayList<Integer>(); 
		List<Integer> nextRound = new ArrayList<Integer>(); 
		List<Integer> finalOutput = new ArrayList<Integer>(); 
		
		Map<Integer,Integer> map = new HashMap<>();
		int counter = 0;
		int balanceChoclates=0;
		for(int i =1; i<=friendsCount ; i++) {
			
			if(i<=friendsCount && counter<=balanceChoclates ) {
			int inc =counter++;
			int value = 1+ inc;
			map.put(i,value);
			value = value+value;
			balanceChoclates = choclateCount -  value;
			}
			
		}
		
		System.out.println("balanceChoclates  " + balanceChoclates);
		System.out.println("map  " + map);

	}

}
