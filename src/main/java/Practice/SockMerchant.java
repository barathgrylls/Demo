package Practice;

import java.util.HashMap;
import java.util.Map;

public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			 
			 //int[] ar= {10, 20, 20, 10, 10, 30, 50, 10, 20};
			 int[] ar= {1 ,1, 3, 1, 2, 1, 3, 3, 3, 3};

			 

		     int counter=0;
		        
		     Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		        
		        for(int i =0; i<ar.length;i++){

		            if(map.containsKey(ar[i])){
		                map.put(ar[i],map.get(ar[i])+1);
		            }else {
		            	map.put(ar[i],1);

		            }
		        }
		        
		        System.out.println(map);

		        for(Map.Entry<Integer,Integer> entry : map.entrySet()){

		            System.out.println(entry.getKey());
		            System.out.println(entry.getValue());

		            if(entry.getValue() % 2==0){
		            }else {
		                counter++;
		            }
		        }
		    	System.out.println(counter);


		    }
	
	}


