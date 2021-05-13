package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HackerRank {

	public static void main(String[] args) {
		
		
		//suqre root finding
		
		 Map<Integer,Integer> map = new HashMap();
	        for(int i=1; i<=100;i++){
	            map.put(i*i,i);
	        }
	        
	        ArrayList<Integer> arrayList = new ArrayList<>();
	        for(int j=3;j<=100;j++){
	        	
	        	Integer foundkey = map.get(j);
	    
	            if(foundkey==null){
	            	
	            }else {
	            	arrayList.add(j);
	            }
	        }
	        
	        System.out.println(arrayList);
	    }

	


}
