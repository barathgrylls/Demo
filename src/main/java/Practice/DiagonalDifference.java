package Practice;

import java.util.ArrayList;
import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<List<Integer>> aList = new ArrayList<List<Integer>>();
		
		List<Integer> a1 = new ArrayList<Integer>(); 
        a1.add(1); 
        a1.add(2); 
        a1.add(3); 

        aList.add(a1); 
  
        List<Integer> a2 = new ArrayList<Integer>(); 
        a2.add(5); 
        a2.add(6); 
        a2.add(7); 
        aList.add(a2); 
  
        List<Integer> a3 = new ArrayList<Integer>(); 
        a3.add(10); 
        a3.add(20); 
        a3.add(30); 
        aList.add(a3); 
  
        for (int i = 0; i < aList.size(); i++) { 
            for (int j = 0; j < aList.get(i).size(); j++) { 
                System.out.print(aList.get(i).get(j) + " "); 
            } 
            System.out.println(); 
        } 
        int leftToRightcount =0;
        for(int i=0; i<=aList.size()-1;i++) {
        	leftToRightcount = leftToRightcount+aList.get(i).get(i); 
        }
        
        //02,11,20
        int rightToLeftCount =0;
        int counter =0;
        for(int i=0; i<=aList.size()-1;i++) {
        	for(int j=0; j<=aList.get(i).size();i++) {
        		int k = aList.get(i).size()-1 + counter;
        		rightToLeftCount = rightToLeftCount+aList.get(i).get(k); 
        		System.out.println(rightToLeftCount);
        	counter--;
        	continue;
        	}
        }
     System.out.println(leftToRightcount); 

    } 
		
		
	}


