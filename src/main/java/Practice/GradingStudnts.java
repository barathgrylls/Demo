package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudnts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> grades = Arrays.asList(80,
				96,
				18,
				73,
				78,
				60,
				60,
				15,
				45,
				15,
				10,
				5,
				46,
				87,
				33,
				60,
				14,
				71,
				65);
		 List<Integer> result = new ArrayList<Integer>();
	        for(Integer grade : grades){

	            int balance = 5 - (grade%5);
	            if(balance == 3 || grade<38|| balance==5||balance==4){
	                result.add(grade);
	            }else if(balance<3 && grade>=38){
	                result.add(grade+balance);
	            }


	            
	        }

	    System.out.println(result);
	    
		
	}

}
