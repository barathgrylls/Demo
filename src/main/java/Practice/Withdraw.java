package Practice;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Withdraw
{
 public static void main(String[] args)
 {

      int moneyValue=2430;
      int[] noteValues= {500,100,50,20,10,1};
      if(moneyValue>15000)
      {
          System.out.println("ATM Cash Limit exceeds.");
      }
      else
      {
         for(int i=0;i<noteValues.length && moneyValue!=0;i++)
         {
             if(moneyValue>=noteValues[i])
                 System.out.println("No of "+noteValues[i]+"'s"+" :"+moneyValue/noteValues[i]);
             moneyValue=moneyValue%noteValues[i];
         }
      }
      
      HashMap<String, Integer> cashDetails = new HashMap<String, Integer>();
      
   	cashDetails.put("20s", 3);
  	cashDetails.put("10s", 4);
  	cashDetails.put("5s", 5);
  	cashDetails.put("1s", 1);
  	
  	int total = 0;
  	Set<Integer> quantity = new HashSet<>();
	for(Map.Entry<String, Integer> entry : cashDetails.entrySet()) {
  		System.out.print(entry.getKey()  + " : " + entry.getValue() + " ");
  		total = total+entry.getValue();
  		quantity.add(entry.getValue());
  	}
  	System.out.println(" ");
  	System.out.println("Total : " + total);
  	
  	moneyValue = 11;
  	 if(moneyValue>total)
     {
         System.out.println("ATM Cash Limit exceeds.");
     }
     else
     {
 		List<Integer> denomination = Arrays.asList(20,10,5,1);
 		int[] noteValuesD= denomination.stream()
                .mapToInt(Integer::intValue)
                .toArray();
        for(int i=0;i<noteValuesD.length && moneyValue!=0;i++)
        {
        	int iterationValue  = 0;
        	 iterationValue = noteValuesD[i];
            if(moneyValue >= iterationValue) {
            	
            	int currentNoteValueSize = cashDetails.get(noteValuesD[i]);
            	int countToReduce = moneyValue/noteValuesD[i] ;
            	if(currentNoteValueSize<=countToReduce) {
            	
                System.out.println("No of "+noteValues[i]+"'s"+" :"+moneyValue/noteValuesD[i]);
            moneyValue=moneyValue%noteValuesD[i];
            	} else {
            		
            	}
            }
        }
     }
      
  }
 
 
	
 
}   
