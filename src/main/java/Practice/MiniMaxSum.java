package Practice;

import java.util.Arrays;

public class MiniMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int[] arr = {256741038 ,623958417 ,467905213, 714532089, 938071625};
	        int min =0;
	        int max=0;
long sum = 0;
	        Arrays.sort(arr);
	        min = arr[0];
	        max = arr[arr.length-1];
	        for(int i=0; i<=arr.length-1;i++){
	            sum = sum + arr[i];
	        }
	        System.out.println(min);
	        System.out.println(max);

	        System.out.println(sum);

	            System.out.println((sum-max)+" "+ (sum-min));
	    }

	}

//2063136757 2744467344
