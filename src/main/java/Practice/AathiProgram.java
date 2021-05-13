package Practice;

import java.util.HashMap;
import java.util.Map;

public class AathiProgram {

	public static void main(String[] args) {

		/*
		 *  Sample Input For Custom Testing
		STDIN      Function 
		-----      -------- 
		5      →   songs[] size n = 5 
		30     →   songs = [30, 20, 150, 100, 40]
		20
		150
		100
		40
		
		Sample Output
		3
		
		Explanation
		There are three pairs of songs whose whole duration is a multiple of a whole minute. They are 20 + 100, 30 + 150, and 20 + 40 corresponding to (1, 3), (0, 2) and (1, 4).

		*/
		
		int a[] = {30, 2, 150, 100, 40};
		int counter1 =0;
		for(int i=0;i<=a.length-1;i++) {

	
		if(a[i]<100 && a[i]>9)
		{
			counter1++;
		}

		
		}
		
		System.out.println(" length1   " + counter1);

		int counter = 0; 
		for(int i=0;i<=a.length-1;i++) {
			for(int j = 0 ; j<=a.length-1;j++) {
				
				if(i!=j) {
				int b = (a[i]+a[j]) % 60 ;
				if(b == 0) {
					counter++;
				}
				}
				
			}
		}
		System.out.println(counter/2);
		
		
		
		Map<Integer, Integer> map = new HashMap<>();
	    int count = 0;
	    for (int t : a) {
	      if (map.containsKey(((60 - t % 60)) % 60)) {
	        count += map.get((60 - t % 60) % 60);
	      }
	      map.put(t % 60, map.getOrDefault(t % 60, 0) + 1);
	    }
		System.out.println(count);

	}

}
