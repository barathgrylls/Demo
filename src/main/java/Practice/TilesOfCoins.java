package Practice;


import java.util.*;

public class TilesOfCoins
{



	public static void main(String[] args) {
		List<Integer> listOfInteger = new ArrayList<>();
		listOfInteger.add(7);
		listOfInteger.add(8);
		listOfInteger.add(9);
		boolean outPut = checkCondition(listOfInteger);
		if (outPut == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
   
        
       
         public static boolean checkCondition(List<Integer> listOfInteger){

            boolean output = false;
            boolean finalOutput = false;
            int counter =0;
            int failCounter=0;
            boolean falg = false;
            List<Integer> listOfInteger1  = new ArrayList<>();

            Collections.sort(listOfInteger,Collections.reverseOrder());
            for(Integer a : listOfInteger){
                counter ++;
                if(a>=1){
                    if(counter ==1)
                        a = a-2;
                    if(counter ==2 || counter ==3)
                        a = a-1;
                }else if(a==0){
                   falg =true;
                    break;
                    
                }
                listOfInteger1.add(a);
            }
            if(!falg) {
            	output = checkCondition(listOfInteger1);
            }
            failCounter = fetchFinalResulet(listOfInteger);
            if(failCounter ==3){
                finalOutput = true;
            }else{
                finalOutput = false;
            }
            return finalOutput;
        }
       
         public static int fetchFinalResulet(List<Integer> listOfInteger){

            int failCounter=0;

             for(Integer a : listOfInteger){
                 
                  if(a==0){
                       failCounter++;
                    }
                 
             }
           
             return failCounter;
         }

    }

