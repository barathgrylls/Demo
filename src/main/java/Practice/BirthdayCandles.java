package Practice;

import java.util.Arrays;
import java.util.List;

public class BirthdayCandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] ar = {82 ,49, 82, 82, 41, 82 ,15, 63, 38, 25};
		Arrays.sort(ar);
		int maxHeight = ar[ar.length-1];
        int maxHeightCounter = 0;
        int arrSize = ar.length;
        //System.out.println(maxHeight);
        for(int i =0;i<=ar.length-1;i++){
            if(ar[i] == maxHeight){
                maxHeightCounter++;
            }
            System.out.println(ar[i]);
        }
               // System.out.println(maxHeightCounter);
                //System.out.println(arrSize-maxHeightCounter);

        
	}

}
